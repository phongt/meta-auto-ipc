SUMMARY = "CommonAPI C++ SOME/IP Runtime"
DESCRIPTION = "CommonAPI C++ is a C++ framework for interprocess and network communication."
HOMEPAGE = "https://github.com/COVESA/capicxx-someip-runtime"
SECTION = "base"
LICENSE = "MPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=815ca599c9df247a0c7f619bab123dad"

DEPENDS += "vsomeip capicxx-core-runtime"

SRC_URI = "\
    git://github.com/COVESA/capicxx-someip-runtime;branch=master;tag=3.2.3-r8;protocol=https \
"

S = "${WORKDIR}/git"

inherit cmake
EXTRA_OECMAKE = "-DUSE_INSTALLED_COMMONAPI=ON"
