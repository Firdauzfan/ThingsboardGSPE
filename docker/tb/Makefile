VERSION=1.4.0
PROJECT=thingsboardsent


build:
	cp ../../application/target/thingsboard.deb .
	docker build -t ${PROJECT}:${VERSION} .
	rm thingsboard.deb


