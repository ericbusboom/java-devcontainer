
# Java Dev Container

## Prebuilding

Prebuilding the container will result in much faster start-up times
for the container. 

* Get an access token from the [jointheleague-it](https://github.com/jointheleague-it) account, with the
  package permissions. [See this guide for details. ](https://docs.github.com/en/packages/working-with-a-github-packages-registry/working-with-the-container-registry#authenticating-with-a-personal-access-token-classic)
* Store the token for future use, here is it ``GITHUB_TOKEN`` but it can be any env var.
* Login to the GH Container Registry: ``echo $GITHUB_TOKEN | docker login ghcr.io -u jointheleague-it  --password-stdin``
* Read the brief [guide to prebuilding](https://containers.dev/implementors/reference). Be sure to install the decvontainer program with npm. 
* Build the container
* Push it to container registry. 

```bash

# Install
npm install -g @devcontainers/cli

# Go to the workspace. 
cd <workspace, with a .devcontainer>

# Build
devcontainer build --workspace-folder . --image-name ghcr.io/league-infrastructure/jtljava:latest

#Login to container registry
echo $GITHUB_TOKEN | docker login ghcr.io -u jointheleague-it  --password-stdin

# Push
docker push ghcr.io/league-infrastructure/jtljava:latest
```
