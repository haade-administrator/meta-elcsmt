SUMMARY = "Home Assistant Kiosk (Chromium wrapper)"
LICENSE = "MIT"
SRC_URI = "file://homeassistant-kiosk.service file://kiosk.sh"

inherit systemd

S = "${WORKDIR}"

do_install() {
    install -d ${D}${systemd_system_unitdir}
    install -m 0644 ${WORKDIR}/homeassistant-kiosk.service ${D}${systemd_system_unitdir}/homeassistant-kiosk.service
    install -d ${D}${bindir}
    install -m 0755 ${WORKDIR}/kiosk.sh ${D}${bindir}/homeassistant-kiosk
}

SYSTEMD_SERVICE_${PN} = "homeassistant-kiosk.service"
FILES_${PN} += "${bindir}/*"
