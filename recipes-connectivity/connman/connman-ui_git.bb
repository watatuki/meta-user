DESCRIPTION = "gtk frontend for connman"
HOMEPAGE = "http://connman.net/"
SECTION = "libs/network"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

DEPENDS = "gtk+3 dbus-glib intltool-native"

SRCREV = "973879df2c4a556e5f49d808a88a6a5faba78c73"
SRC_URI = "git://github.com/tbursztyka/connman-ui.git;protocol=git"

S = "${WORKDIR}/git"

inherit autotools

RDEPENDS_${PN} = "connman"

FILES_${PN} += "${datadir}/connman_ui_gtk/icons/*.png \
								${datadir}/connman_ui_gtk/ui/*.ui "

PR = "r1"


