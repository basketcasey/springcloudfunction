@echo off
echo Deploying Functions ...
xcopy "%DEPLOYMENT_SOURCE%/target/azure-functions/azurefunction-20181003152432846" %DEPLOYMENT_TARGET% /Y /S