DESCRIPTION = "QjackCtl is a simple Qt application to control the JACK sound server daemon."
HOMEPAGE = "http://qjackctl.sourceforge.net/"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=751419260aa954499f7abaabaa882bbe"
SECTION = "x11/apps"

PR = "r1"

SRC_URI = "http://downloads.sourceforge.net/qjackctl/qjackctl-${PV}.tar.gz \
           file://configure.patch \
          "

SRC_URI[md5sum] = "cc01522902105ca65e327e657e51ca5e"
SRC_URI[sha256sum] = "5cdd937c44e5c737f3d2c2063ada015cac2fc8ed0cdbcb90d0ba747087270132"

inherit autotools gettext pkgconfig
DEPENDS += "jack virtual/libx11 qt4-x11-free"

do_install() {
	install -d ${D}${bindir}
	install -m 0755 ${S}/${BPN} ${D}${bindir}
}
