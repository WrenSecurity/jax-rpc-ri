#!/usr/bin/env bash

set -e
set -u

gpg --default-key "${GPG_DEFAULT_KEY}" --passphrase "${GPG_KEY_PASSPHRASE}" \
  --no-use-agent \
  --batch --yes \
  $@
