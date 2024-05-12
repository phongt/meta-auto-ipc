SUMMARY = "iceoryx - true zero-copy inter-process-communication"
DESCRIPTION = "iceoryx is an inter-process-communication (IPC) middleware for various operating systems"
HOMEPAGE = "https://iceoryx.io/"
SECTION = "base"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=46d6aa0ba1fa2ed247cd8d42f20b72f4"

DEPENDS += "ncurses acl cpptoml"

SRC_URI = "git://github.com/eclipse-iceoryx/iceoryx.git;branch=release_2.0;tag=v2.0.6;protocol=https"

S = "${WORKDIR}/git"

inherit cmake
EXTRA_OECMAKE = "-H${S}/iceoryx_meta -DDOWNLOAD_TOML_LIB=OFF"

do_install:append() {
    rm -rf ${D}/usr/etc
}
