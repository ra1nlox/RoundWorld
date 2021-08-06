# RoundWorld

This is actually plugin that can't be used on every server because of my stupidity.
I made bounds static and they can't be changed in configuration file.
Wait for updates (actually don't, i am not sure if i will do something with this plugin)

## How it works
### For X axis
If player will pass bounds described in source code of this plugin (stupid, yeah?) he will be teleported to the oposite side.
### For Z axis
If player will pass bounds for Z axis he will be teleported to the oposite site by this algorithm: MAX_X_COORDINATE (which is constant) - current X coordinate of player + 3
