# clojure-send-mail
Simple application to send mail with Clojure

## Build

lein do clean, install, uberjar

## Usage

java -jar -Dhost="${HOST}" -Dusername="${USERNAME}" -Dpassword="${PASSWORD}" -Dto="${TO}" -Dsubject="${SUBJECT}" target/mail-send-0.1.0-SNAPSHOT-standalone.jar

## License

Copyright 2016 Daniel Cunha

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
