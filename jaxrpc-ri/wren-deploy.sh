#!/usr/bin/env bash
set -e
set -u

export MVN_REPO_ID='wrensecurity-releases'
export MVN_REPO_URL='https://wrensecurity.jfrog.io/wrensecurity/releases'

./wren-build.sh maven-deploy
