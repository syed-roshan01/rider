@echo off
"%LOCALAPPDATA%\Android\Sdk\build-tools\36.0.0\d8.bat" --min-api 26 --output "app\dist\d8-out" @app\dist\d8-args.txt > app\dist\d8.log 2>&1
