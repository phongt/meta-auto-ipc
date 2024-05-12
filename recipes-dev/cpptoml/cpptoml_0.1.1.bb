SUMMARY = "cpptoml"
DESCRIPTION = "A header-only library for parsing TOML configuration files."
HOMEPAGE = "https://github.com/skystrife/cpptoml"
SECTION = "base"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8739ce451f437fa9493b37a405fb16f1"

DEPENDS += "ncurses acl"

SRC_URI = "\
    git://github.com/skystrife/cpptoml.git;branch=master;tag=v0.1.1;protocol=https \
    file://add-missing-header.patch \
"

S = "${WORKDIR}/git"

inherit cmake
