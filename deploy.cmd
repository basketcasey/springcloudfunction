@echo off
echo Deploying Functions ...
xcopy "%DEPLOYMENT_SOURCE%/target/azure-functions/springbootfunctions-20181008155935406" %DEPLOYMENT_TARGET% /Y /S