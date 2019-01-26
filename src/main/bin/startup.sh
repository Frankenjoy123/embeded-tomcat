#!/usr/bin/env bash

export TOMCAT_HOME=/Users/zhouxiaowu/install/tomcat/demo-tomcat-8080

export APP_DEPLOY_HOME=/Users/zhouxiaowu/IdeaProject-tongdun/Example

export CATALINA_BASE=$APP_DEPLOY_HOME/tomcat

export CATALINA_PID=$CATALINA_BASE/tomcat.pid

export TOMCAT_LOG=$APP_DEPLOY_HOME/tomcat.log

echo "======app started before======="
$TOMCAT_HOME/bin/startup.sh >$TOMCAT_LOG 2>&1 &
