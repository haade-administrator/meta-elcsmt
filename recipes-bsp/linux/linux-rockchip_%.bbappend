FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

do_install:append() {
    install -d ${D}${nonarch_base_libdir}/dtb
    for f in ${WORKDIR}/rockchip/*.dtb; do
        [ -f "$f" ] && install -m 0644 "$f" ${D}${nonarch_base_libdir}/dtb/
    done
}

FILES:${PN}-devicetree += "${nonarch_base_libdir}/dtb/*"


