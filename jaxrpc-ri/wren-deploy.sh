#!/usr/bin/env bash
set -e
set -u

# `D7F749B5` could have applied here if we didn't have our own fork of this
# project; but since we're modifying the project slightly and adding our own
# version stamp suffix, it seems more genuine to consider this a project we
# "produce" artifacts for.
export GPG_DEFAULT_KEY="C081F89B"

export MVN_REPO_ID='wrensecurity-releases'
export MVN_REPO_URL='https://wrensecurity.jfrog.io/wrensecurity/releases'

IS_GPG1=$(gpg --version | head | grep -q "gpg (GnuPG) 1" && echo 1 || echo 0)

# Only GPG v1 allows us to preload the passphrase.
if [[ "${IS_GPG1}" -eq 1 ]]; then
  passphrase_var="${GPG_DEFAULT_KEY}_PASSPHRASE"

  # Check if `wren-preload-creds` has already loaded this passphrase
  if [[ -z "${!passphrase_var:-}" ]]; then
    echo "Passphrase for GPG key '${GPG_DEFAULT_KEY}': "
    read -s "${passphrase_var}"
  fi

  export GPG_KEY_PASSPHRASE="${!passphrase_var}"
else
  echo "NOTE: GPG will prompt you for signing passphrase '${GPG_DEFAULT_KEY}'."
  echo ""

  export GPG_TTY=$(tty)
fi

./wren-build.sh maven-deploy
