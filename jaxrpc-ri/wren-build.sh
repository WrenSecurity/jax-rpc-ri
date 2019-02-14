#!/usr/bin/env bash

set -e
set -u

./build.sh clean ${1:-maven-distribution}
