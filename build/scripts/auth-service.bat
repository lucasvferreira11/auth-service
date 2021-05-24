@rem
@rem Copyright 2015 the original author or authors.
@rem
@rem Licensed under the Apache License, Version 2.0 (the "License");
@rem you may not use this file except in compliance with the License.
@rem You may obtain a copy of the License at
@rem
@rem      https://www.apache.org/licenses/LICENSE-2.0
@rem
@rem Unless required by applicable law or agreed to in writing, software
@rem distributed under the License is distributed on an "AS IS" BASIS,
@rem WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
@rem See the License for the specific language governing permissions and
@rem limitations under the License.
@rem

@if "%DEBUG%" == "" @echo off
@rem ##########################################################################
@rem
@rem  auth-service startup script for Windows
@rem
@rem ##########################################################################

@rem Set local scope for the variables with windows NT shell
if "%OS%"=="Windows_NT" setlocal

set DIRNAME=%~dp0
if "%DIRNAME%" == "" set DIRNAME=.
set APP_BASE_NAME=%~n0
set APP_HOME=%DIRNAME%..

@rem Resolve any "." and ".." in APP_HOME to make it shorter.
for %%i in ("%APP_HOME%") do set APP_HOME=%%~fi

@rem Add default JVM options here. You can also use JAVA_OPTS and AUTH_SERVICE_OPTS to pass JVM options to this script.
set DEFAULT_JVM_OPTS=

@rem Find java.exe
if defined JAVA_HOME goto findJavaFromJavaHome

set JAVA_EXE=java.exe
%JAVA_EXE% -version >NUL 2>&1
if "%ERRORLEVEL%" == "0" goto execute

echo.
echo ERROR: JAVA_HOME is not set and no 'java' command could be found in your PATH.
echo.
echo Please set the JAVA_HOME variable in your environment to match the
echo location of your Java installation.

goto fail

:findJavaFromJavaHome
set JAVA_HOME=%JAVA_HOME:"=%
set JAVA_EXE=%JAVA_HOME%/bin/java.exe

if exist "%JAVA_EXE%" goto execute

echo.
echo ERROR: JAVA_HOME is set to an invalid directory: %JAVA_HOME%
echo.
echo Please set the JAVA_HOME variable in your environment to match the
echo location of your Java installation.

goto fail

:execute
@rem Setup the command line

set CLASSPATH=%APP_HOME%\lib\auth-service-0.1.jar;%APP_HOME%\lib\grpc-kotlin-stub-1.0.0.jar;%APP_HOME%\lib\micronaut-kotlin-runtime-2.3.1.jar;%APP_HOME%\lib\micronaut-grpc-runtime-2.4.0.jar;%APP_HOME%\lib\micronaut-grpc-client-runtime-2.4.0.jar;%APP_HOME%\lib\micronaut-grpc-server-runtime-2.4.0.jar;%APP_HOME%\lib\micronaut-grpc-annotation-2.4.0.jar;%APP_HOME%\lib\micronaut-runtime-2.5.4.jar;%APP_HOME%\lib\micronaut-validation-2.5.4.jar;%APP_HOME%\lib\micronaut-http-2.5.4.jar;%APP_HOME%\lib\micronaut-context-2.5.4.jar;%APP_HOME%\lib\micronaut-aop-2.5.4.jar;%APP_HOME%\lib\micronaut-inject-2.5.4.jar;%APP_HOME%\lib\javax.annotation-api-1.3.2.jar;%APP_HOME%\lib\jackson-datatype-jdk8-2.12.2.jar;%APP_HOME%\lib\jackson-datatype-jsr310-2.12.2.jar;%APP_HOME%\lib\jackson-databind-2.12.2.jar;%APP_HOME%\lib\jackson-annotations-2.12.2.jar;%APP_HOME%\lib\jackson-core-2.12.2.jar;%APP_HOME%\lib\jackson-module-kotlin-2.12.2.jar;%APP_HOME%\lib\kotlin-reflect-1.4.32.jar;%APP_HOME%\lib\kotlin-stdlib-jdk8-1.4.32.jar;%APP_HOME%\lib\logback-classic-1.2.3.jar;%APP_HOME%\lib\micronaut-core-reactive-2.5.4.jar;%APP_HOME%\lib\micronaut-core-2.5.4.jar;%APP_HOME%\lib\grpc-stub-1.33.1.jar;%APP_HOME%\lib\grpc-protobuf-1.33.1.jar;%APP_HOME%\lib\grpc-protobuf-lite-1.33.1.jar;%APP_HOME%\lib\grpc-netty-1.33.1.jar;%APP_HOME%\lib\grpc-core-1.33.1.jar;%APP_HOME%\lib\grpc-api-1.33.1.jar;%APP_HOME%\lib\spotbugs-annotations-4.0.3.jar;%APP_HOME%\lib\perfmark-api-0.19.0.jar;%APP_HOME%\lib\jsr305-3.0.2.jar;%APP_HOME%\lib\snakeyaml-1.26.jar;%APP_HOME%\lib\slf4j-api-1.7.26.jar;%APP_HOME%\lib\rxjava-2.2.10.jar;%APP_HOME%\lib\reactive-streams-1.0.3.jar;%APP_HOME%\lib\validation-api-2.0.1.Final.jar;%APP_HOME%\lib\kotlin-stdlib-jdk7-1.4.32.jar;%APP_HOME%\lib\kotlinx-coroutines-core-jvm-1.4.3.jar;%APP_HOME%\lib\kotlin-stdlib-1.4.32.jar;%APP_HOME%\lib\netty-codec-http2-4.1.64.Final.jar;%APP_HOME%\lib\netty-handler-proxy-4.1.64.Final.jar;%APP_HOME%\lib\netty-codec-http-4.1.64.Final.jar;%APP_HOME%\lib\netty-handler-4.1.64.Final.jar;%APP_HOME%\lib\netty-codec-socks-4.1.64.Final.jar;%APP_HOME%\lib\netty-codec-4.1.64.Final.jar;%APP_HOME%\lib\netty-transport-4.1.64.Final.jar;%APP_HOME%\lib\netty-buffer-4.1.64.Final.jar;%APP_HOME%\lib\netty-resolver-4.1.64.Final.jar;%APP_HOME%\lib\netty-common-4.1.64.Final.jar;%APP_HOME%\lib\kotlin-stdlib-common-1.4.32.jar;%APP_HOME%\lib\grpc-context-1.33.1.jar;%APP_HOME%\lib\protobuf-java-3.14.0.jar;%APP_HOME%\lib\javax.inject-1.jar;%APP_HOME%\lib\config-1.4.1.jar;%APP_HOME%\lib\logback-core-1.2.3.jar;%APP_HOME%\lib\annotations-13.0.jar;%APP_HOME%\lib\proto-google-common-protos-1.17.0.jar;%APP_HOME%\lib\guava-29.0-android.jar;%APP_HOME%\lib\error_prone_annotations-2.3.4.jar;%APP_HOME%\lib\animal-sniffer-annotations-1.18.jar;%APP_HOME%\lib\failureaccess-1.0.1.jar;%APP_HOME%\lib\listenablefuture-9999.0-empty-to-avoid-conflict-with-guava.jar;%APP_HOME%\lib\checker-compat-qual-2.5.5.jar;%APP_HOME%\lib\j2objc-annotations-1.3.jar;%APP_HOME%\lib\gson-2.8.6.jar;%APP_HOME%\lib\annotations-4.1.1.4.jar


@rem Execute auth-service
"%JAVA_EXE%" %DEFAULT_JVM_OPTS% %JAVA_OPTS% %AUTH_SERVICE_OPTS%  -classpath "%CLASSPATH%" com.github.lucasvferreira11.ApplicationKt %*

:end
@rem End local scope for the variables with windows NT shell
if "%ERRORLEVEL%"=="0" goto mainEnd

:fail
rem Set variable AUTH_SERVICE_EXIT_CONSOLE if you need the _script_ return code instead of
rem the _cmd.exe /c_ return code!
if  not "" == "%AUTH_SERVICE_EXIT_CONSOLE%" exit 1
exit /b 1

:mainEnd
if "%OS%"=="Windows_NT" endlocal

:omega
