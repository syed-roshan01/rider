@echo off
"C:\Users\toros\AppData\Local\Android\Sdk\build-tools\36.0.0\d8.bat" --min-api 26 --output "build\d8-out" @build\d8-args.txt > build\d8.log 2>&1
