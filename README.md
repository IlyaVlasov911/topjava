# Стажировка <a href="https://github.com/JavaWebinar/topjava">Topjava</a>
- Не стоит стремиться прочитать все ссылки урока, их можно использовать как справочник. Гораздо важнее пройти основной материал урока и сделать Домашнее Задание
- Обязательно посмотри <a href="https://github.com/JavaOPs/topjava/wiki/Git#Правила-работы-с-патчами-на-проекте">правила работы с патчами на проекте</a>
- Делать Apply Patch лучше по одному, непосредственно перед видео на эту тему, а при просмотре видео сразу отслеживать все изменения кода проекта по изменению в патче (`Git-> Local Changes-> Ctrl+D`)
- **При первом Apply удобнее выбрать имя локального ченджлиста Name: Change**. Далее все остальные патчи также будут в него попадать.
- **Код проекта обновляется и не всегда совпадает с видео (можно увидеть как развивался проект). Изменения в проекте указываю после соответствующего патча.**

## <a href="https://drive.google.com/drive/u/0/folders/0B9Ye2auQ_NsFfm5hSHEtbmxmN2kxb0NocVRwWl9KanowWXVCVXRZTlhaM09wQUswZkRidTA">Материалы занятия</a> (скачать все патчи можно через `Download/Скачать` папки patch)
![image](https://cloud.githubusercontent.com/assets/13649199/18330295/5f2ca214-7560-11e6-8e1e-c0494f798c37.png)

### ![correction](https://cloud.githubusercontent.com/assets/13649199/13672935/ef09ec1e-e6e7-11e5-9f79-d1641c05cbe6.png) Рефакторинг проекта

#### Apply 1_0_rename.patch
- переименовал классы `UserMeal*` в более красивые `Meal*`
- преименовал `MealWithExceed` transfer object класс (что это такое пройдем позже)  в `MealTo` ([data transfer object naming convention](https://stackoverflow.com/questions/1724774/java-data-transfer-object-naming-convention))

## ![hw](https://cloud.githubusercontent.com/assets/13649199/13672719/09593080-e6e7-11e5-81d1-5cb629c438ca.png) Разбор домашнего задания HW0:
### ![video](https://cloud.githubusercontent.com/assets/13649199/13672715/06dbc6ce-e6e7-11e5-81a9-04fbddb9e488.png) 1. <a href="https://drive.google.com/file/d/1hXU8VUKVxrayyQ6Xu7f3OGZWCSdK9Pyi">Optional: реализация getFilteredMealsWithExcess через Stream API</a>
- В патче `prepare_to_HW0.patch` вступительного задания метод фильтрации в `TimeUtil` переименовали в `isBetweenHalfOpen` (также изменилась логика сравнения - `startTime` включается в интервал)

#### Apply 1_1_HW0_streams.patch

- [Презентация Java 8](https://docs.google.com/presentation/d/1oltLkHK60FqIdsXjUdm4pPLSeC6KpNYjDsM0ips-qBw)

### ![video](https://cloud.githubusercontent.com/assets/13649199/13672715/06dbc6ce-e6e7-11e5-81a9-04fbddb9e488.png) 2. <a href="https://drive.google.com/open?id=1K0kan7TEUeOAe_qcdCtRF9rsqD-NwFZ7">Работа с git в IDEA. Реализация через цикл.</a>
### ВНИМАНИЕ! Патчей `1_opt_2_cycles_HW0` и `1_opt_3_opt2_HW0` не будет в проекте! Делаем в отдельной ветке (у меня `MealsUtil_opt`). Это варианты решений, которые не идут в `master`

![image](https://user-images.githubusercontent.com/13649199/83656711-8b758b00-a5c8-11ea-9de4-c2ade77d4598.png)

#### Apply 1_opt_2_cycles_HW0.patch

### ![question](https://cloud.githubusercontent.com/assets/13649199/13672858/9cd58692-e6e7-11e5-905d-c295d2a456f1.png) Вопросы по HW0

> почему не использовать в `TimeUtil` методы `isBefore/isAfter` ?

это строгие (excluded) сравнения, а нам также нужно краевые значения

> В `MealsUtil` у нас где-то есть ключевое слово `final`, где-то нет. В чем разница?

Я участвовал в одном  проекте, где `final` был обязательным (в сеттингах IDEA галочка стояла). Но это скорее исключение, чем правило в проектах java (в Java 8 вообще ввели эффективный final, те по факту). Во всех новомодных языках переменные final по умолчанию, а в java нужно помнить и везде добавлять, утомительно. Но если приучитесь - хуже не будет. Я обычно ставлю там, где важно по смыслу (если не забываю).

### ![video](https://cloud.githubusercontent.com/assets/13649199/13672715/06dbc6ce-e6e7-11e5-81a9-04fbddb9e488.png) 3. [HW0 Optional 2: реализация в один проход циклами и Stream API](https://drive.google.com/file/d/1dSt3axySxu4V9dMnuR1wczerlI_WzCep)

#### Apply 1_opt_3_HW0_opt2.patch
- [DevEcosystem from JetBrains](https://www.jetbrains.com/lp/devecosystem-2020/java/)
- Дополнительно:
    - [Первое занятие MasterJava: многопоточность](https://github.com/JavaOPs/masterjava)
    - [Обзор java.util.concurrent.*](https://habr.com/ru/company/luxoft/blog/157273/)

## Занятие 1:

### ![video](https://cloud.githubusercontent.com/assets/13649199/13672715/06dbc6ce-e6e7-11e5-81a9-04fbddb9e488.png) 4. <a href="https://drive.google.com/open?id=0B9Ye2auQ_NsFRmo0YkVVaDJPTVE">Обзор используемых в проекте технологий. Интеграция ПО.</a>
- [Java Technology Report 2021](https://www.jrebel.com/blog/2021-java-technology-report)
- [Экосистема Java от JetBrains](https://www.jetbrains.com/ru-ru/lp/devecosystem-2021/java/)
- [Популярность Java-технологий в 2019 году](https://topjava.ru/blog/sostoyanie-java-v-2019-godu)
-  <a href="http://www.youtube.com/watch?v=rJZHerwi8R0">Видео "Приложение Spring Pet Clinic"</a>
-  Приложение <a href="https://github.com/spring-projects/spring-petclinic">Spring Pet Clinic</a>.

### ![video](https://cloud.githubusercontent.com/assets/13649199/13672715/06dbc6ce-e6e7-11e5-81a9-04fbddb9e488.png) 5. [Обзор языка Java и его инфраструктуры](https://www.youtube.com/watch?v=jWfqopZwcNs)
- [Tiobe index](https://www.tiobe.com/tiobe-index/)
- [JetBrains devecosystem 2021](https://www.jetbrains.com/lp/devecosystem-2021/java/)
- [The State of Java in 2019](https://www.baeldung.com/java-in-2019)
- [JVM Ecosystem Report 2021](https://snyk.io/jvm-ecosystem-report-2021/)

### ![video](https://cloud.githubusercontent.com/assets/13649199/13672715/06dbc6ce-e6e7-11e5-81a9-04fbddb9e488.png) 6. [Maven](https://drive.google.com/file/d/1qEJTwv9FNUQjx-y9MSydH01xaAne0-hu)
- Wiki: [Apache Maven](https://ru.wikipedia.org/wiki/Apache_Maven)
- [The Central Repository](http://search.maven.org)
- Дополнительно:
    - [Мое Wiki Maven](https://github.com/JavaOPs/topjava/wiki/Maven)
    - [Основы Maven](https://www.youtube.com/watch?v=0uwMKktzixU)
    - JavaRush: [Основы Maven](https://javarush.ru/groups/posts/2523-chastjh-4osnovih-maven)
    - Инструмент сборки проектов [Maven](https://www.examclouds.com/ru/java/java-core-russian/lesson20)
    - [Maven Getting Started Guide](https://maven.apache.org/guides/getting-started/index.html)
    - [Видео: Maven vs Gradle vs SBT (Архипов, Борисов, Садогурский)](https://www.youtube.com/watch?v=21qdRgFsTy0)
    - [Build Lifecycle](http://maven.apache.org/guides/introduction/introduction-to-the-lifecycle.html)
    - [Dependency Mechanism](http://maven.apache.org/guides/introduction/introduction-to-dependency-mechanism.html)

### ![video](https://cloud.githubusercontent.com/assets/13649199/13672715/06dbc6ce-e6e7-11e5-81a9-04fbddb9e488.png) 7. <a href="https://drive.google.com/open?id=0B9Ye2auQ_NsFT3pWNkMzWVVybnc">WAR. Веб-контейнер Tomcat. Сервлеты.</a>
> - Обновил зависимость до Servlet 4.0. Установите себе [Tomcat 9.x](https://tomcat.apache.org/download-90.cgi)

**Внимание: Tomcat 10 требует пакета `javarta.*`, устанавливайте 9-ю версию**

> - Устанавливать Tomcat лучше простым скачиванием архива `xxx.zip` (например для Windows `apache-tomcat-9.0.35-windows-x64.zip`) и копированием из него в **каталог без пробелов и русских букв** (пример `С:\java\apache-tomcat-9.0.35`)

### ВНИМАНИЕ! далее патчи идут в ветку `master` после `1_1_HW0_streams`

#### Apply 1_2_switch_to_war.patch
> - Обновил сервлеты до версии 4.0 (Tomcat 9 использует это API, хотя для нас не принципиально, т.к. мы никакие <a href="https://ru.wikipedia.org/wiki/Сервлет_(Java)">фичи 3.x и 4.x Servlet API</a> не используем)
> - Переименовал `userList.jsp` в `users.jsp`
### Сервлет добавляется в следующем патче, те в `web.xml` он будет подчеркиваться красным.

#### Apply 1_3_add_servlet_api.patch

> - Если зависимость `servlet-api` не подтянулась, сделай `Reimport All Maven Projects` (см. [Обновить зависимости в maven проекте](https://github.com/JavaOPs/topjava/wiki/IDEA#maven_update)).
    **Все зависимости в Maven прект подтягиваются ТОЛЬКО через Maven**.
> - [Проверка, кто занял порт](https://stackoverflow.com/a/38953356/548473) (в случае проблем с запуском и дебагом на портах 8080, 8000)</a>
> - [**Деплой war в Tomcat с Application context**](https://github.com/JavaOPs/topjava/wiki/IDEA#Деплой-war-в-tomcat-application-context-должен-быть-тот-же-что-и-url-приложения-деплоить-надо-war-exploded)
> - [**Динамическое обновление без передеплоя**](https://github.com/JavaOPs/topjava/wiki/IDEA#Для-динамической-перегрузки-ресурсов-кнопка-нажмите-кнопку-update-resource-on-frame-deactivation)

> Если `packge` выдает ошибку
```
[INFO] --- maven-war-plugin:2.2:war (default-war) @ topjava ---
[WARNING] Error injecting: org.apache.maven.plugin.war.WarMojo
com.google.inject.ProvisionException: Unable to provision, see the following errors:
1) Error injecting constructor, java.lang.ExceptionInInitializerError: Cannot access defaults field of Properties
  at org.apache.maven.plugin.war.WarMojo.<init>(Unknown Source)
```
[гуглим по сообщению ошибки](https://stackoverflow.com/questions/66920567/error-injecting-org-apache-maven-plugin-war-warmojo)! Решения:
- или понизить версию JDK <=14 (на JDK 17 мы мигрируем на 5-м занятии).  
  После смены JDK в `Project Structure...` обязательно `clean` и `Reload` кнопка в maven окошке.
- или добавьте после `maven-compiler-plugin`:
```
<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-war-plugin</artifactId>
    <version>3.3.2</version>
</plugin>
```
Новые версии JDK уже неправильно работают с war package по умолчанию. Им нужна новая версия упаковки, конфигурим ее плагином.

#### Apply 1_4_forward_to_redirect.patch

- <a href="http://tomcat.apache.org/">Tomcat Home Page</a>
- [Жизненный цикл сервлета. Для каждого сервлета создается только одна копия](https://metanit.com/java/javaee/4.8.php)
- [Сервлеты, Java servlet API. Пишем простое веб-приложение](https://javarush.ru/groups/posts/2529-chastjh-5-servletih-pishem-prostoe-veb-prilozhenie)
- <a href="https://devcolibri.com/как-создать-servlet-полное-руководство/">Руководство: как создать servlet</a>
- Томкат менеджер: [http://localhost:8080/manager](http://localhost:8080/manager)
    - в `TOMCAT_HOME\conf\tomcat-users.xml` нужно добавить
```
<user username="tomcat" password="tomcat" roles="tomcat,manager-gui,admin-gui"/>
```
- Если проблема с Tomcat debug и работает Dr.Web- нужно его отключить, либо добавить в исключения путь к  `.IntelliJIdeaXXX/`
- Наше приложение: [http://localhost:8080/topjava](http://localhost:8080/topjava)
- Наш сервлет:     [http://localhost:8080/topjava/users](http://localhost:8080/topjava/users)

- Дополнительно:
    - Remote debug встречается много реже - приконнекчивание к уже запущенной JVM, которую, например, нельзя запустить из IDEA. Можно попробовать запустить catalina через `jpda start`, задеплоить туда war и уже после этого после приконнектиться через запуск `Tomcat Server -> Remote`
      ![image](https://user-images.githubusercontent.com/13649199/120930503-2a5e2700-c6f6-11eb-81c4-f21de8efbb8f.png)
    - [Настройки Remote Debug в новой IDEA](https://github.com/JavaOPs/topjava/wiki/IDEA#remote-debug-в-новой-idea)
    - <a href="http://blog.trifork.com/2014/07/14/how-to-remotely-debug-application-running-on-tomcat-from-within-intellij-idea">Remotely debug on tomcat from IDEA</a>
    - [HTTP](https://developer.mozilla.org/ru/docs/Web/HTTP)
    - <a href="http://info.javarush.ru/idea_help/2014/01/22/Руководство-пользователя-IntelliJ-IDEA-Отладчик-.html">Отладчик IntelliJ IDEA</a>
    - <a href="https://www.youtube.com/watch?v=tN8K1y-HSws&list=PLkKunJj_bZefB1_hhS68092rbF4HFtKjW&index=14">Yakov Fain: Intro to Java EE. Glassfish. Servlets (по-русски)</a>
    - <a href="https://www.youtube.com/watch?v=Vumy_fbo-Qs&list=PLkKunJj_bZefB1_hhS68092rbF4HFtKjW&index=15">Yakov Fain: HTTP Sessions, Cookies, WAR deployments, JSP (по-русски)</a>
    - <a href="https://www.youtube.com/playlist?list=PLoij6udfBncjHaO5s7Ln4w4BLj5FVc49P">Golovach Courses: Junior.February2014.Servlets</a>
    - <a href="http://java-online.ru/jsp.xhtml">Java Server Page</a>
    - <a href="http://stackoverflow.com/questions/1890438/how-to-get-parameters-from-the-url-with-jsp#1890462">Java объекты, доступные в JSP</a>

### ![video](https://cloud.githubusercontent.com/assets/13649199/13672715/06dbc6ce-e6e7-11e5-81a9-04fbddb9e488.png) 8. <a href="https://drive.google.com/open?id=0B9Ye2auQ_NsFaTdYUnpLNFFUeXM">Логирование.</a>
#### Apply 1_5_logging.patch

**Установите переменную окружения на TOPJAVA_ROOT на корень проекта и перезапустите IDEA. Слеши в пути должны быть в стиле unix (/)**

Проверить, видит ли Java вашу переменную можно через `System.getenv("TOPJAVA_ROOT")`

- [Set environment for Win/Mac/Unix](https://chlee.co/how-to-setup-environment-variables-for-windows-mac-and-linux/)
- [Set environment for UNIX (advanced)](https://askubuntu.com/a/849954)
    - [Определить, какой Login или Non-Login Shell](https://tecadmin.net/difference-between-login-and-non-login-shell)
    - [Порядок запуска скриптов при старте](https://www.baeldung.com/linux/bashrc-vs-bash-profile-vs-profile)
- Или простой вариант (не забудте добавить и в Run, и в Debug)

![image](https://user-images.githubusercontent.com/13649199/76862707-8af21180-686f-11ea-9f8c-2bb30ef4c3b2.png)

**Иногда антивирусы блокируют логирование (например Comodo). Если не работает и стоит антивирус- добавьте исключение.**

> - изменения в проекте: убрал `LoggerWrapper` и логирую напрямую в логгер SLF4J. При логгировании через вспомогательный класс, в логе теряется имя исходного класса.
> - удалил зависимость `jul-to-slf4j`. Она нам не нужна и, согласно <a href="https://www.youtube.com/watch?v=qzqAUUgB3v8">видео Владимира Красильщика про логирование</a>, она замедляет работу
> - удалил зависимость `jcl-over-slf4j`. Используем Spring 5, который напрямую использует `slf4j` без `common-logging`. Про миграцию на Spring 5 будет видео в следующих занятиях.
> - Не делать конкатенацию строк при логгировании сообщений, если уровень логирования в конфигурации выставлен выше уровня логирования в коде
    >   - [slf4j formatting with {}](http://stackoverflow.com/a/10596390/548473)
>   - [What is the fastest way of (not) logging](https://www.slf4j.org/faq.html#logging_performance)

- <a href="http://habrahabr.ru/post/113145/">Java Logging: история кошмара</a>
- [JavaRush: Logger](https://javarush.ru/quests/lectures/questcollections.level04.lecture09)
- <a href="http://web.archive.org/web/20201127002158/http://skipy.ru/useful/logging.html">Ведение лога приложения</a>
- <a href="http://logging.apache.org/log4j/2.x/index.html">Log4j</a>, <a href="http://logback.qos.ch/">Logback</a>
- <a href="http://www.slf4j.org/legacy.html">Добавление зависимостей логирования</a> в проект.
- <a href="http://logback.qos.ch/manual/configuration.html#variableSubstitution">Logback variable substitution</a>

#### Проверочные вопросы:
- Что нужно изменить в `pom.xml`, чтобы перейти с logback на log4j ?

### ![question](https://cloud.githubusercontent.com/assets/13649199/13672858/9cd58692-e6e7-11e5-905d-c295d2a456f1.png) Ваши вопросы

> Почему `private static final Logger log` а не `LOG` ?

Это [правило именования констант, которые не "deeply immutable"](https://google.github.io/styleguide/javaguide.html#s5.2.4-constant-names), те если их содержимое можно изменить.

> Используются ли сервлеты на реальных проектах сегодня?

1. Сервлеты лежат в основе любого Java web фреймворка, если взаимодействие не асинхронное и не nio (например Spring MVC). Работать с таким фреймворком и не знать, что такое сервлеты, все равно что работать с JPA/Hibarnate/любым ORM без знания JDBC.
2. Бывают легаси проекты, бывают современные, где не подтягивается сторонний web фреймворк. При этом, даже работая с фреймворком, приходится иметь дело с Servlet API (часто с `HttpServletRequest/HttpServletResponse`) - обработка ошибок, валидаторы, фильтры, пре/пост обработка зарпосов, получение ip, работа с сессией и пр.


>  Используются ли еще где-то в реальной разработке JSP, или это уже устаревшая технология? Заменит ли ее JSF (https://javatalks.ru/topics/38037)?

JSF и JSP- разные ниши и задачи.
JSP- шаблонизатор, JSF - МVС фреймворк. Из моего опыта- с JSP сталкивался в 60% проектов. Его прямая замена: http://www.thymeleaf.org (в Spring-Boot по умолчанию), но в уже запущенных проектах встречается достаточно редко. JSP не умирает, потому что просто и дешево. Кроме того включается в большинство веб-контейнеров (в Tomcat его реализация Jasper)

JSF- sun-овский еще фреймворк, с которым я ни разу не сталкивался и особого желания нет. Вот он как раз, по моему мнению, активно замещается хотя бы javascript фреймворками (angular, react, vue.js).

> Какой метод сервлета вызвается из HTML/JSP: doGet/doDelete/doPut..?

Методы можно посмотреть в вкладке браузера `Network`. По [сcылке](http://htmlbook.ru/html/a/href) вызывается `GET/doGet()`. Из [формы можно делать GET и POST](http://htmlbook.ru/html/form/method), обычно данные формы передаются через POST. **Для других методов нужен JavaScript, пока их не используем**

> А зачем мы использовали logback? Почему SLF4J нас не устроило? Почему реализация логирования не log4j?

`SLF4J-API` это API. Там есть только пустая реализация `org.slf4j.helpers.NOPLogger` (можно посмотреть в исходниках). Logback для новых проектов стал стандарт. *spring-petclinic* и *spring-boot* используют его по умолчанию.
Вместе с `logback-classic` подтягивается транзитивная зависимость `slf4j-api`. Можно было бы включить `logback-classic` в `pom.xml` со `scope:compile` и не включать `slf4j-api`. Нам версия `slf4j-api` понадобится, когда мы добавим в проект бриджи.
- http://logback.qos.ch/reasonsToSwitch.html

---------

## ![hw](https://cloud.githubusercontent.com/assets/13649199/13672719/09593080-e6e7-11e5-81d1-5cb629c438ca.png) Домашнее задание HW01 (делаем ветку HW01 от последнего патча в master)

#### **ОСНОВНОЕ, чему мы учимся на проекте: мыслить и работать как Java разработчики уже сейчас**, потом это будет гораздо сложнее и стоить дороже.
Вот на мой взгляд [хорошие советы новичкам](http://blog.csssr.ru/2016/09/19/how-to-be-a-beginner-developer). От себя я добавлю:
> - Учись грамотно формулировать проблему. Проблема "у меня не работает" может иметь тысячи причин. В процессе формулирования очень часто приходит ее решение.
    >    - что я делаю (подробно, чтобы понял человек, который не копался в этом совсем)
>    - что получаю (обычно верх самого последнего эксепшена)
>    - мои попытки решения проблемы

> - Учись исследовать проблему. Внимательное чтение логов и [умение дебажить](http://info.javarush.ru/idea_help/2014/01/22/Руководство-пользователя-IntelliJ-IDEA-Отладчик-.html) - основные навыки разработчика. Обычно самый верх самого нижнего эксепшена- причина ошибки, туда нужно ставить брекпойнт.
> - Грамотно уделяй время каждой проблеме. Две крайности - сразу бросаться за помощью и биться над ней часами. Пробуй решить ее сам и в зависимости от проблемы выделяй на это разумное время.

----------------------------------------------------
- **Обязательно и как можно чаще пользуйтесь `Ctrl+Alt+L` - отформатировать код класса**
- **При изменениях на UI не забываетй сбрасывать кэш браузера - `Ctrl+F5`**
- **При удалении классов не забывате чистить target - в окошке Maven или `mvn clean`**
- **При проблемах с IDEA пользуйтесь `Refresh` в окошке Maven**
- **При проблемах с выполнением проверьте (и удалите) лишние java процессы (например в Task Manager)**

--------------------------------------------
#### 1. Реализовать сервлет с отображением в таблице списка еды (в памяти и БЕЗ учета пользователя)

> Деплоиться в Tomcat лучше как `war exploded`: нет упаковки в war и при нажатой кнопке `Update Resources on Frame Deactivation` можно обновляться css, html, jsp без передеплоя. При изменении `web.xml`, добавлении методов, классов необходим redeploy.

- 1.1 По аналогии с `UserServlet` добавить `MealServlet` и `meals.jsp`
    - Задеплоить приложение (war) в Tomcat c `applicationContext=topjava` (приложение должно быть доступно по <a href="http://localhost:8080/topjava">http://localhost:8080/topjava</a>)
    - Попробовать разные деплои в Tomcat, remote и local debug
- 1.2 Сделать отображения списка еды в JSP [в таблице](http://htmlbook.ru/html/table), цвет записи в таблице зависит от параметра `excess` (красный/зеленый).
    - 1.2.1 Список еды захардкодить (те проинициализировать в коде, желательно чтобы в проекте инициализация была только в одном месте). Норму калорий (caloriesPerDay) сделать в коде константой
    - 1.2.2 Время выводить без 'T'
    - 1.2.3 Список выводим БЕЗ фильтрации по `startTime/endTime`
    - 1.2.4 С обработкой исключений пока можно не заморачиваться, мы будем красиво обрабатывать в конце стажировки
    - 1.2.5 Вариант реализации:
        - из сервлета преобразуете еду в `List<MealTo>`;
        - кладете список в запрос (`request.setAttribute`);
        - делаете `forward` на jsp для отрисовки таблицы (при `redirect` атрибуты теряются).
        - **JSP работает через геттеры: `meal.dateTime` в JSP вызывает `meal.getDateTime()`**
        - в `JSP` для цикла можно использовать `JSTL tag forEach`. Для подключения `JSTL` в `pom.xml` и шапку JSP нужно добавить:
```
    <dependency>
       <groupId>javax.servlet</groupId>
       <artifactId>jstl</artifactId>
       <version>1.2</version>
    </dependency>

    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    ...
```

- <a href="https://java-course.ru/old/students/part7.html">Интернет-приложения на JAVA</a>
- <a href="https://java-course.ru/old/students/part8.html">JSP</a>
- [Как создать Servlet? Полное руководство](https://devcolibri.com/как-создать-servlet-полное-руководство)
- [JSTL для написания JSP страниц](https://devcolibri.com/jstl-для-написания-jsp-страниц/)
- <a href="http://javatutor.net/articles/jstl-patterns-for-developing-web-application-1">JSTL: Шаблоны для разработки веб-приложений в java</a>
- <a href="http://stackoverflow.com/questions/35606551/jstl-localdatetime-format">JSTL LocalDateTime format</a>

### Optional
#### 2. Реализуем в ПАМЯТИ (любая коллекция) CRUD (create/read/update/delete) для еды
**Пример: [Simple CRUD using Servlet/JSP](https://danielniko.wordpress.com/2012/04/17/simple-crud-using-jsp-servlet-and-mysql)**
> - Пример нужно САМОСТОЯТЕЛЬНО переделать: вместо хранения в MySql нужно хранить в коллекции ПАМЯТИ (задание упрощается).
> - Классы: сервлет, **инрерфейс хранения**, его реализация для хранения в памяти
- 2.1 Хранение в памяти будет одна из наших CRUD реализаций (позже будет JDBC, JPA и DATA-JPA).
- 2.2 Работать с реализацией CRUD через интерфейс, который не должен ничего знать о деталях реализации (Map, DB или что-то еще).
- 2.3 Добавить поле `id` в `Meal/ MealTo`. Реализовать генерацию счетчика, УЧЕСТЬ МНОГОПОТОЧНОСТЬ СЕРВЛЕТОВ. В качестве первичного ключа используют UUID, Long, Integer. На нашем проекте будем использовать **Integer**.
    - [обзор java.util.concurrent](https://habrahabr.ru/company/luxoft/blog/157273/)
- 2.4 Сделать форму редактирования в JSP: AJAX/JavaScript использовать НЕ надо, делаем через `<form method="post">` и `doPost()` в сервлете.
- 2.5 Для ввода дат и времени можно использовать <a href="https://webref.ru/html/input/type">html5 типы</a>, хотя они поддерживаются не всеми браузерами (<a href="https://robertnyman.com/html5/forms/input-types.html">протестировать свой браузер</a>). В конце курса мы добавим <a href="http://xdsoft.net/jqplugins/datetimepicker/">DateTimePicker jQuery plugin</a>, который будет работать на всех браузерах.
- 2.6 Форму на create-update предлагаю не дублировать, сделать одну (хотя это не ошибка сделать разные).

## После выполнения ДЗ обязательно <a href="lesson01.md#-Типичные-ошибки">проверьте решение на ошибки</a>

### ![question](https://cloud.githubusercontent.com/assets/13649199/13672858/9cd58692-e6e7-11e5-905d-c295d2a456f1.png) Вопросы по HW1

> Не попадаю на страничку/брекпойнт в сервлете.

- внимательно проверь url и applicationContext (Application Context должен быть тот же, что и url приложения: <a href="https://github.com/JavaOPs/topjava/wiki/IDEA#%D0%94%D0%B5%D0%BF%D0%BB%D0%BE%D0%B9-war-%D0%B2-tomcat-application-context-%D0%B4%D0%BE%D0%BB%D0%B6%D0%B5%D0%BD-%D0%B1%D1%8B%D1%82%D1%8C-%D1%82%D0%BE%D1%82-%D0%B6%D0%B5-%D1%87%D1%82%D0%BE-%D0%B8-url-%D0%BF%D1%80%D0%B8%D0%BB%D0%BE%D0%B6%D0%B5%D0%BD%D0%B8%D1%8F-%D0%B4%D0%B5%D0%BF%D0%BB%D0%BE%D0%B8%D1%82%D1%8C-%D0%BD%D0%B0%D0%B4%D0%BE-war-exploded">wiki IDEA</a>)
- посмотрите в task manager: возможно запущено несколько JVM и они мешают друг другу. Лишние java приложения убить.

> Приложение не видит TOPJAVA_ROOT.

**После выставления переменной окружения IDEA нужно рестартовать. Слеши в пути должны быть в стиле unix (/)**. Проверить, видит ли java переменную окружения можно так: `System.getenv("TOPJAVA_ROOT")`. Еще вариант: добавить `-DTOPJAVA_ROOT=...` в опции запуска приложения, тогда она доступна из java как `System.getProperty("TOPJAVA_ROOT")`.

> Проблемы с кодировкой в POST (кракозябры).

Возможное решение - выставьте кодировку ДО первого чтения из request:
```
protected void doPost(HttpServletRequest request, ...) {
    request.setCharacterEncoding("UTF-8");
```

> Если сервлет тыкают несколько пользователей / несколько браузеров, какого должно быть поведение? Нужно ли что-то делать с сессиями?

В Optional нужно делать реализацию хранения потокобезопасной. Cессии пока не используем  (начнутся, когда будет прикручивать авторизацию).

> Для чего нам нужна потокобезопасная реализация коллекции, если каждый пользователь видит только себя?

Реализация хранения в памяти у нас одна на всех. Те коллекция шарится между пользователями, они в разных потоках ее дергают. Если несколько потоков одновременно будут изменять коллекцию без учета потокобезопасная (например один будет удалять, второй вставлять),  без учета потокобезопасности мы получим `ConcurrentModificationException`

> Предпочтительнее ли создавать новый объект `Meal` при каждом update?

Если при обновлении не создавать копию, то сохраненный в памяти объект может кто-то попортить. Вопрос скорее доверия к коду- если проект большой и людей над ним трудится много, то вероятнее нужно копировать.

> Почему теряются атрибуты при передаче на сервлет: `http://localhost:8080/topjava/meals?action=add&...` и `req.getAttribute("action")` = null ?

См. <a href="http://stackoverflow.com/questions/5243754/difference-between-getattribute-and-getparameter">Difference between getAttribute() and getParameter()</a>. Отсюда также следует, что при редиректе атрибуты теряются.

> Зачем нужен в jsp `<jsp:useBean id=".." scope="request" type=".."/>` ?

[jsp:useBean](http://java-online.ru/jsp-actions.xhtml#useBean) нужен IDEA для автодополнений - она понимает тип переменной, которая уже доступна в JSP (например через setAttribute). И еще эта переменная становится доступной в java вставках. Для вывода в JSP это тэг не обязателен. Если тип переменной JSP не совпадает с тем, что в `jsp:useBean`, будет ошибка.

----------------------------
### Итоги занятия после выполнения ДЗ:
Мы создали CRUD веб-приложение для управления едой (создание-чтение-обновление-удаление) с использованием сервлетов и логированием. Пока в памяти, и пока еда никому не принадлежит.
Пример выполнения ДЗ (не надо сложного интерфейса, Bootstrap css будем проходить на 8-м занятии):

![image](https://user-images.githubusercontent.com/13649199/94701494-6100c800-0345-11eb-9907-2a0099305710.png)
![image](https://user-images.githubusercontent.com/13649199/94701688-9a393800-0345-11eb-9c2d-dd53ba55724c.png)

### ![error](https://cloud.githubusercontent.com/assets/13649199/13672935/ef09ec1e-e6e7-11e5-9f79-d1641c05cbe6.png) Типичные ошибки
- 1 **Если в названии класса есть `Meal`, не нужно использовать слово meal в методах класса.**
- 2 Привыкайте писать комментарии к чекину: одной фразой что вы сделали в нем. Например: *Meals CRUD implementation*. См.
  [Как писать сообщения коммитов](https://habr.com/ru/post/416887/)
- 3 Хранение в памяти и операции с ней должны выполняться просто и эффективно
- 4 Хранить нужно `Meal` и конвертировать ее в `MealTo` когда отдаем список на отображение в JSP.
    - excess нужно пересчитывать каждый раз перед отображением
    - форматирование должно находится в JSP! Именно он заведует отображением. Повторяем паттерн [MVC](https://ru.wikipedia.org/wiki/Model-View-Controller)
- 5 Стили `color` можно применять ко всей строке таблицы `tr`, а не каждой ячейке.
- 6 `DateTimeFormatter` можно сделать один заранее (он потокобезопасный в отличие от `SimpleDateFormatter`), а не создавать новый при каждом запросе.
- 7 Работать с CRUD надо через интерфейс.
- 8 Реализаций хранения будет несколько, нужно учитывать это в названии класса имплементации работы в памяти.
- 9 В `web.xml` принято группировать сервлет со своим маппингом
- 10 Не размещайте никакую логику (форматирование, счетчики) в бинах, где хранятся только данные (`Meal, MealTo`)
- 11 Еще раз: детали реализации в памяти не должны быть никому видны. Те НЕ НАДО счетчик размещать в `Meal` или `MealServlet` или `MealsUtil`, в базе же он будет по другому генерится.
- 12 `volatile` при ++ не помогает от многопоточности. Почему?
- 13 Обратите также внимание на то, чтобы реализация вашей коллекции для хранения еды была также многопоточной.
- 14 Не делайте дублирование кода `MealsUtil`. Простой вариант - использовать то, что отсутствие фильтрации - это частный случай фильтрации (когда ничего не отсеивается). В моем решении используется [паттерн стратегия](https://refactoring.guru/ru/design-patterns/strategy)
- 15 Не дублируйте строки в `jsp`. Посмотрите на <a href="https://steveswinsburg.wordpress.com/2008/09/04/the-ternary-operator-and-jsp/">тернарный оператор</a>.
- 16 После операции `delete` в браузере должен быть url `http:\\localhost:8080\topjava\meals`
- 17 Перед чекином проверяйте свой ченджлист (`Ctrl+D` на файле из `Local Changes` - посмотреть что поменялось). Если там только пробелы/переводы строк, не надо его комитить - делайте файлу `Git->revert`.
- 18 Учтите в названии реализации CRUD, что
    - 18.1 у нас будет несколько реализаций (не только в памяти)
    - 18.2 у нас будет 2 CRUD (для еды и пользователей). А в реальном проекте их намного больше.
- 19 Сессии НЕ использовать! При редиректе все атрибуты (`req.getAttribute()`) теряются (см. вопрос выше). Сценарий редиректа:
    - 1 из сервлета делаем редирект (снова на сервлет, не на JSP!)
    - 2 снова заходим в сервлет
    - 3 кладем нужные атрибуты и делаем forward на jsp
    - 4 если очень хочется передать параметры из 1. в 2. можно сделать их через параметры запроса (например `meals?id=5`) и доставать через `reg.getParameter(id)`. В моей реализации такого не потребовалось.