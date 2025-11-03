#!/bin/sh
URL="http://localhost:8123"
exec /usr/bin/chromium --no-sandbox --kiosk "$URL" --incognito --disable-translate
