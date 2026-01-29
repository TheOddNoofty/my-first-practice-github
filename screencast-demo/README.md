# Screencast Demo

**Your full name:** [REPLACE WITH YOUR FULL NAME]

**GitHub repo:** (replace with your repo URL after pushing)

**Screencast video:** (link to video on YouTube/Vimeo - add after upload)

**Screencast software:** OBS Studio (free, open source)
**OBS version:** (fill after install)

**IDE used:** Visual Studio Code (with Java extensions)

## What this repo contains
- `Testing.java` — simple Java program used in the demo
- `script.txt` — short script used for recording (see below)

## How I recorded the screencast
1. Installed OBS Studio and configured microphone and optional webcam.
2. Recorded a short (<= 3 minutes) video: intro, run `Testing.java`, demonstrate a bug by changing `b=1` to `b=0`, show git commits/branching/restore, upload video.

## Git demo commands used (examples)
```powershell
cd screencast-demo
git init
git add Testing.java README.md
git commit -m "Initial import: working Testing.java"
# make an intentional bug (edit Testing.java -> b = 0)
git add Testing.java
git commit -m "Introduce division-by-zero bug for demo"
# create a branch to fix
git checkout -b fix/div-zero
# edit Testing.java to add safe check or restore
git add Testing.java
git commit -m "Fix division-by-zero by adding check"
# merge back
git checkout main
git merge fix/div-zero
```

## Submission
- Repo made public and submitted to Canvas.

---

