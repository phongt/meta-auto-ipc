SUMMARY = "COVESA CommonAPI CPP Core Runtime"
DESCRIPTION = "CommonAPI C++ is a C++ framework for interprocess and network communication."
HOMEPAGE = "https://github.com/COVESA/capicxx-core-runtime"
SECTION = "base"
LICENSE = "MPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=815ca599c9df247a0c7f619bab123dad"

SRC_URI = "\
    git://github.com/COVESA/capicxx-core-runtime.git;branch=master;tag=3.2.3-r7;protocol=https \
    file://0001-Fix-compliation-fail-Types_hpp.patch \
"

S = "${WORKDIR}/git"

inherit cmake
