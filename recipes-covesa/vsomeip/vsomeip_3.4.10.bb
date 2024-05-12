SUMMARY = "COVESA vsomeip"
DESCRIPTION = "\
    The vsomeip stack implements the http://some-ip.com/ \
    (Scalable service-Oriented MiddlewarE over IP (SOME/IP)) protocol. \
"
HOMEPAGE = "https://github.com/COVESA/vsomeip"
SECTION = "base"
LICENSE = "MPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9741c346eef56131163e13b9db1241b3"

DEPENDS += "boost"

SRC_URI = "\
    git://github.com/COVESA/vsomeip.git;branch=master;tag=3.4.10;protocol=https \
    file://0001-Fixed-Windows-CI-builds-586.patch \
"

S = "${WORKDIR}/git"

inherit cmake
EXTRA_OECMAKE = "-DVSOMEIP_INSTALL_ROUTINGMANAGERD=ON"

do_install:append() {
    rm -rf ${D}/usr/etc
}
