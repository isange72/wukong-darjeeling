all:
	cd ..; ant clean
	cd ..; ant arduino
	-mkdir ../../../../../../hardware/arduino/picodevice
	cp ../darjeeling.a libdarjeeling.a
	rm -rf libraries/WukongVM/wkpf
	-mkdir libraries/WukongVM/wkpf
	find ../../.. -name '*.h' -exec cp \{} libraries/WukongVM/wkpf \; 2> /dev/null
	cp ../c/config.h libraries/WukongVM/wkpf

install: all
	cp -a ../../../../../../hardware/arduino/avr/* ../../../../../../hardware/arduino/picodevice
	cp -a boards.txt platform.txt libdarjeeling.a ../../../../../../hardware/arduino/picodevice > /dev/null
	cp -a libraries/WukongVM ../../../../../../hardware/arduino/picodevice/libraries > /dev/null
	echo "Deploy successfully"
	cp arduino-wukong ../../../../../..
		
