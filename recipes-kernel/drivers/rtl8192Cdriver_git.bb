SECTION = "devel"
SUMMARY = "rtl8192C driver"
DESCRIPTION = "rtl8192C driver"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://README.md;md5=c2568c1019ea8854debe08fe61943066"

DEPENDS = "virtual/kernel"

inherit module

PR = "r1"

SRC_URI = "git://github.com/watatuki/rtl8192C_driver_genelic.git"
SRCREV = "e3ddae511bfcbc26a4c2c6f6c75b048f89d95e2a"

S = "${WORKDIR}/git"

export KSRC="${STAGING_KERNEL_DIR}"

do_install() {
    mkdir -p ${D}/lib/modules/${KERNEL_VERSION}/kernel/drivers/net/wireless/
    cp ${S}/*.ko \ 
    ${D}/lib/modules/${KERNEL_VERSION}/kernel/drivers/net/wireless/
}
