#!/usr/bin/env bash
export GPG_COMMAND='./wren-gpg.sh'
export GPG_DEFAULT_KEY="D7F749B5"
export GPG_KEY_PASSPHRASE="${D7F749B5_PASSPHRASE}"

./build.sh clean maven-distribution
