@if "%DEBUG%" == "" @echo off
@rem ##########################################################################
@rem
@rem  spaceLaunchDummy startup script for Windows
@rem
@rem ##########################################################################

@rem Set local scope for the variables with windows NT shell
if "%OS%"=="Windows_NT" setlocal

set DIRNAME=%~dp0
if "%DIRNAME%" == "" set DIRNAME=.
set APP_BASE_NAME=%~n0
set APP_HOME=%DIRNAME%..

@rem Add default JVM options here. You can also use JAVA_OPTS and SPACE_LAUNCH_DUMMY_OPTS to pass JVM options to this script.
set DEFAULT_JVM_OPTS=

@rem Find java.exe
if defined JAVA_HOME goto findJavaFromJavaHome

set JAVA_EXE=java.exe
%JAVA_EXE% -version >NUL 2>&1
if "%ERRORLEVEL%" == "0" goto init

echo.
echo ERROR: JAVA_HOME is not set and no 'java' command could be found in your PATH.
echo.
echo Please set the JAVA_HOME variable in your environment to match the
echo location of your Java installation.

goto fail

:findJavaFromJavaHome
set JAVA_HOME=%JAVA_HOME:"=%
set JAVA_EXE=%JAVA_HOME%/bin/java.exe

if exist "%JAVA_EXE%" goto init

echo.
echo ERROR: JAVA_HOME is set to an invalid directory: %JAVA_HOME%
echo.
echo Please set the JAVA_HOME variable in your environment to match the
echo location of your Java installation.

goto fail

:init
@rem Get command-line arguments, handling Windows variants

if not "%OS%" == "Windows_NT" goto win9xME_args

:win9xME_args
@rem Slurp the command line arguments.
set CMD_LINE_ARGS=
set _SKIP=2

:win9xME_args_slurp
if "x%~1" == "x" goto execute

set CMD_LINE_ARGS=%*

:execute
@rem Setup the command line

set CLASSPATH=%APP_HOME%\lib\spaceLaunchDummy-1.0-SNAPSHOT.jar;%APP_HOME%\lib\jsonschema2pojo-gradle-plugin-0.4.30.jar;%APP_HOME%\lib\json-simple-1.1.jar;%APP_HOME%\lib\jsonschema2pojo-core-0.4.30.jar;%APP_HOME%\lib\gson-2.8.2.jar;%APP_HOME%\lib\spring-mock-mvc-3.0.7.jar;%APP_HOME%\lib\rest-assured-3.0.7.jar;%APP_HOME%\lib\json-path-3.0.7.jar;%APP_HOME%\lib\json-schema-validator-3.0.7.jar;%APP_HOME%\lib\xml-path-3.0.7.jar;%APP_HOME%\lib\testng-6.14.2.jar;%APP_HOME%\lib\annotations-1.3.9.jar;%APP_HOME%\lib\groovy-json-2.4.12.jar;%APP_HOME%\lib\rest-assured-common-3.0.7.jar;%APP_HOME%\lib\groovy-xml-2.4.12.jar;%APP_HOME%\lib\groovy-2.4.12.jar;%APP_HOME%\lib\json-schema-validator-2.2.6.jar;%APP_HOME%\lib\hamcrest-library-1.3.jar;%APP_HOME%\lib\hamcrest-core-1.3.jar;%APP_HOME%\lib\commons-lang3-3.4.jar;%APP_HOME%\lib\tagsoup-1.2.1.jar;%APP_HOME%\lib\jaxb-api-2.2.12.jar;%APP_HOME%\lib\spring-test-4.2.6.RELEASE.jar;%APP_HOME%\lib\spring-webmvc-4.2.6.RELEASE.jar;%APP_HOME%\lib\jcommander-1.72.jar;%APP_HOME%\lib\bsh-2.0b6.jar;%APP_HOME%\lib\json-schema-core-1.2.5.jar;%APP_HOME%\lib\jackson-coreutils-1.8.jar;%APP_HOME%\lib\jackson-databind-2.7.2.jar;%APP_HOME%\lib\javaparser-1.0.11.jar;%APP_HOME%\lib\android-4.1.1.4.jar;%APP_HOME%\lib\codemodel-2.6.jar;%APP_HOME%\lib\uri-template-0.9.jar;%APP_HOME%\lib\msg-simple-1.1.jar;%APP_HOME%\lib\btf-1.2.jar;%APP_HOME%\lib\jsr305-3.0.1.jar;%APP_HOME%\lib\moshi-1.1.0.jar;%APP_HOME%\lib\commons-lang-2.6.jar;%APP_HOME%\lib\commons-io-2.4.jar;%APP_HOME%\lib\validation-api-1.0.0.GA.jar;%APP_HOME%\lib\joda-time-2.3.jar;%APP_HOME%\lib\jackson-mapper-asl-1.9.13.jar;%APP_HOME%\lib\libphonenumber-6.2.jar;%APP_HOME%\lib\mailapi-1.4.3.jar;%APP_HOME%\lib\jopt-simple-4.6.jar;%APP_HOME%\lib\httpmime-4.5.1.jar;%APP_HOME%\lib\httpclient-4.5.3.jar;%APP_HOME%\lib\spring-web-4.2.6.RELEASE.jar;%APP_HOME%\lib\spring-context-4.2.6.RELEASE.jar;%APP_HOME%\lib\spring-aop-4.2.6.RELEASE.jar;%APP_HOME%\lib\spring-beans-4.2.6.RELEASE.jar;%APP_HOME%\lib\spring-expression-4.2.6.RELEASE.jar;%APP_HOME%\lib\spring-core-4.2.6.RELEASE.jar;%APP_HOME%\lib\jackson-annotations-2.7.0.jar;%APP_HOME%\lib\jackson-core-2.7.2.jar;%APP_HOME%\lib\commons-logging-1.2.jar;%APP_HOME%\lib\opengl-api-gl1.1-android-2.1_r1.jar;%APP_HOME%\lib\xmlParserAPIs-2.6.2.jar;%APP_HOME%\lib\xpp3-1.1.4c.jar;%APP_HOME%\lib\json-20080701.jar;%APP_HOME%\lib\okio-1.6.0.jar;%APP_HOME%\lib\jackson-core-asl-1.9.13.jar;%APP_HOME%\lib\rhino-1.7R4.jar;%APP_HOME%\lib\activation-1.1.jar;%APP_HOME%\lib\httpcore-4.4.6.jar;%APP_HOME%\lib\commons-codec-1.9.jar;%APP_HOME%\lib\guava-16.0.1.jar;%APP_HOME%\lib\aopalliance-1.0.jar

@rem Execute spaceLaunchDummy
"%JAVA_EXE%" %DEFAULT_JVM_OPTS% %JAVA_OPTS% %SPACE_LAUNCH_DUMMY_OPTS%  -classpath "%CLASSPATH%" TestScripts.TS01_APITest %CMD_LINE_ARGS%

:end
@rem End local scope for the variables with windows NT shell
if "%ERRORLEVEL%"=="0" goto mainEnd

:fail
rem Set variable SPACE_LAUNCH_DUMMY_EXIT_CONSOLE if you need the _script_ return code instead of
rem the _cmd.exe /c_ return code!
if  not "" == "%SPACE_LAUNCH_DUMMY_EXIT_CONSOLE%" exit 1
exit /b 1

:mainEnd
if "%OS%"=="Windows_NT" endlocal

:omega
