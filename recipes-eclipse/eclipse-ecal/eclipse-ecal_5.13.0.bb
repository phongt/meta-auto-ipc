SUMMARY = "eCAL (enhanced Communication Abstraction Layer)"
DESCRIPTION = "\
eCAL (enhanced Communication Abstraction Layer) is a fast publish-subscribe middleware \
that can manage inter-process data exchange, as well as inter-host communication. \
"
HOMEPAGE = "https://eclipse-ecal.github.io/ecal/"
SECTION = "base"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=dbef9c501cb27a10080e3aaddcf0fb69"

DEPENDS += "protobuf protobuf-native"

SRC_URI = "gitsm://github.com/eclipse-ecal/ecal.git;branch=support/v5.13;tag=v5.13.0;protocol=https"

S = "${WORKDIR}/git"

inherit cmake
EXTRA_OECMAKE = "\
    -DHAS_QT=OFF \
    -DHAS_HDF5=OFF \
    -DHAS_CURL=OFF \
    -DHAS_FTXUI=OFF \
    -DECAL_THIRDPARTY_BUILD_PROTOBUF=OFF \
    -DECAL_THIRDPARTY_BUILD_CURL=OFF \
    -DECAL_THIRDPARTY_BUILD_HDF5=OFF \
    -DECAL_THIRDPARTY_BUILD_QWT=OFF \
    -DBUILD_APPS=OFF \
    -DBUILD_SAMPLES=OFF \
"
do_install:append() {
    rm -rf ${D}/usr/share/
}
