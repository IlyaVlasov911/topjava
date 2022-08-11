let form;

function makeEditable(datatableApi) {
    ctx.datatableApi = datatableApi;
    form = $('#detailsForm');

    $(document).ajaxError(function (event, jqXHR, options, jsExc) {
        failNoty(jqXHR);
    });

    // solve problem with cache in IE: https://stackoverflow.com/a/4303862/548473
    $.ajaxSetup({cache: false});
}

function add() {
    $("#modalTitle").html(i18n["addTitle"]);
    form.find(":input").val("");
    $("#editRow").modal();
}

function updateRow(id) {
    form.find(":input").val("");
    $("#modalTitle").html(i18n["editTitle"]);
    $.get(ctx.ajaxUrl + id, function (data) {
        $.each(data, function (key, value) {
            form.find("input[name='" + key + "']").val(key === "dateTime" ? value.replace("T", " ").substring(0, 16) : value);
        });
        $('#editRow').modal();
    });
}

function deleteRow(id) {
    if (confirm(i18n['common.confirm'])) {
        $.ajax({
            url: ctx.ajaxUrl + id,
            type: "DELETE"
        }).done(function () {
            ctx.updateTable();
            successNoty("common.deleted");
        });
    }
}

function updateTableByData(data) {
    ctx.datatableApi.clear().rows.add(data).draw();
}

function save() {
    $.ajax({
        type: "POST",
        url: ctx.ajaxUrl,
        data: form.serializeArray().map(x => x.name === "dateTime" ? (x.value = x.value().replace(" ", "T")).substring(0, 16) + ":00" && x : x)
    }).done(function () {
        $("#editRow").modal("hide");
        ctx.updateTable();
        successNoty("common.saved");
    });
}

let failedNote;

function closeNoty() {
    if (failedNote) {
        failedNote.close();
        failedNote = undefined;
    }
}

function successNoty(key) {
    closeNoty();
    new Noty({
        text: "<span class='fa fa-lg fa-check'></span> &nbsp;" + i18n[key],
        type: 'success',
        layout: "bottomRight",
        timeout: 1000
    }).show();
}

function renderEditBtn(data, type, row) {
    if (type === "display") {
        return "<a onclick='updateRow(" + row.id + ");'><span class='fa fa-pencil'></span></a>";
    }
}

function renderDeleteBtn(data, type, row) {
    if (type === "display") {
        return "<a onclick='deleteRow(" + row.id + ");'><span class='fa fa-remove'></span></a>";
    }
}

function failNoty(jqXHR) {
    closeNoty();
    failedNote = new Noty({
        text: "<span class='fa fa-lg fa-exclamation-circle'></span> &nbsp;" + i18n["common.errorStatus"] + ": " + jqXHR.status + (jqXHR.responseJSON ? "<br>" + jqXHR.responseJSON : ""),
        type: "error",
        layout: "bottomRight"
    });
    failedNote.show()
}

$('input#startDate[data-datetimepicker-type=date]').datetimepicker({
    timepicker: false,
    format: 'Y-m-d',
    onShow: function (ct) {
        const val = $('#endDate').val();
        if (val) this.setOptions({maxDate: val});
    }
});

$('input#endDate[data-datetimepicker-type=date]').datetimepicker({
    timepicker: false,
    format: 'Y-m-d',
    onShow: function (ct) {
        const val = $('#startDate').val();
        if (val) this.setOptions({minDate: val});
    }
});

$('input#startTime[data-datetimepicker-type=time]').datetimepicker({
    datepicker: false,
    format: 'H:i',
    onShow: function (ct) {
        const val = $('#endTime').val();
        if (val) this.setOptions({maxTime: val});
    }
});

$('input#endTime[data-datetimepicker-type=time]').datetimepicker({
    datepicker: false,
    format: 'H:i',
    onShow: function (ct) {
        const val = $('#startTime').val();
        if (val) this.setOptions({minTime: val});
    }
});

$('input[data-datetimepicker-type=datetime]').datetimepicker({format: 'Y-m-d H:i'});