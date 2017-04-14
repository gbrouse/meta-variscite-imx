require recipes-bsp/u-boot/u-boot1.inc

DESCRIPTION = "U-Boot for Variscite SOM platforms"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/gpl-2.0.txt;md5=b234ee4d69f5fce4486a80fdaf4a4263"

PROVIDES = "u-boot"


SRCREV = "${AUTOREV}"
SRCBRANCH = "george"
SRC_URI = "https://github.com/gbrouse/variscite-uboot-imx.git;protocol=git;branch=${SRCBRANCH}"
LIC_FILES_CHKSUM = "file://README;md5=d3893ecbe5dadb7446983acba5cd607d"

S = "${WORKDIR}/git"

PACKAGE_ARCH = "${MACHINE_ARCH}"

COMPATIBLE_MACHINE = "(var-som-mx6)"

