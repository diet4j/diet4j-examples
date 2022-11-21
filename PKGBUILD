pkgname=$(basename $(pwd))
pkgver=0.24
pkgrel=1
pkgdesc='diet4j Java module examples'
arch=('any')
url="http://jdiet.org/"
license=('Apache')
makedepends=('maven' 'jdk11-openjdk' 'unzip' )
depends=('java-runtime' 'java-jsvc' 'diet4j')

prepare() {
    # Set pom.xml versions correctly; depends on XML-comment-based markup in pom.xml files
    # This is a great big hack, but does the job
    find ${startdir} -path ${startdir}/pkg -prune -o -name pom.xml -exec perl -pi -e "s/(?<=\<\!-- PKGVER -->)(\d+(\.\d+)+)(?=\<\!-- \/PKGVER -->)/${pkgver}/g" {} \;
}

build() {
    cd ${startdir}
    mvn package install ${MVN_OPTS}
}

package() {
    # Jars
    installOne 'diet4j-examples-activate'
    installOne 'diet4j-examples-logging'
    installOne 'diet4j-examples-one'
    installOne 'diet4j-examples-utils'
}

installOne() {
    local name=$1
    install -m644 -D ${startdir}/${name}/target/${name}-${pkgver}.jar ${pkgdir}/usr/lib/java/org/diet4j/${name}/${pkgver}/${name}-${pkgver}.jar

    unzip -p -x ${pkgdir}/usr/lib/java/org/diet4j/${name}/${pkgver}/${name}-${pkgver}.jar META-INF/maven/org.diet4j/${name}/pom.xml \
           > ${pkgdir}/usr/lib/java/org/diet4j/${name}/${pkgver}/${name}-${pkgver}.pom
    unzip -p -x ${pkgdir}/usr/lib/java/org/diet4j/${name}/${pkgver}/${name}-${pkgver}.jar META-INF/maven/org.diet4j/${name}/pom.properties \
           > ${pkgdir}/usr/lib/java/org/diet4j/${name}/${pkgver}/${name}-${pkgver}.properties
}
