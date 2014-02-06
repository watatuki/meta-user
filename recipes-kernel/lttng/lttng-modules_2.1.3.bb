SECTION = "devel"
SUMMARY = "Linux Trace Toolkit KERNEL MODULE"
DESCRIPTION = "The lttng-modules 2.1 package contains the kernel tracer modules"
LICENSE = "LGPLv2.1 & GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1412caf5a1aa90d6a48588a4794c0eac \
                    file://gpl-2.0.txt;md5=751419260aa954499f7abaabaa882bbe \
                    file://lgpl-2.1.txt;md5=243b725d71bb5df4a1e5920b344b86ad"

DEPENDS = "virtual/kernel"

inherit module

SRC_URI[md5sum] = "6990be2076015e7706bbb8781d6da1bf"
SRC_URI[sha256sum] = "28e368570814c2e82ba2872cedbea25cfb680885121135827d87192b01f561d5"
PR = "r0"

SRC_URI = "http://lttng.org/files/lttng-modules/lttng-modules-2.1.3.tar.bz2 \
           file://lttng-modules-replace-KERNELDIR-with-KERNEL_SRC.patch \
           file://LTTng_system_call_tracing_on_ARM.patch "

export INSTALL_MOD_DIR="kernel/lttng-modules"
export KERNEL_SRC="${STAGING_KERNEL_DIR}"

