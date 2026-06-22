# Git Workflow for BridgeLabz SIPP Training

## Branch Strategy

### Active Branches:
1. **main** - Production/stable code (core-java-practice stable content)
2. **core-java-practice** - Core Java practice and exercises
3. **OOPs** - Object-Oriented Programming projects (OOPS folder only)

## Workflow Instructions

### For OOPS Folder Work:

```bash
# 1. Ensure you're on the OOPs branch
git checkout OOPs

# 2. Make changes only in the OOPS/ folder
# Edit and create files in OOPS/ directory

# 3. Stage only OOPS folder changes
git add OOPS/

# 4. Commit with a clear message
git commit -m "OOPS: Add your description here"

# 5. Push to OOPs branch
git push origin OOPs
```

### For core-java-practice Work:

```bash
# 1. Switch to core-java-practice branch
git checkout core-java-practice

# 2. Make changes in core-java-practice/ folder

# 3. Stage changes
git add core-java-practice/

# 4. Commit
git commit -m "core-java: Add your description here"

# 5. Push to core-java-practice branch
git push origin core-java-practice
```

## Important Rules:

✅ **DO:**
- Checkout the correct branch before starting work
- Only add files from the folder you're working on
- Use descriptive commit messages with folder prefix (e.g., "OOPS: ", "core-java: ")
- Push to the appropriate branch

❌ **DON'T:**
- Don't push OOPS folder changes when on other branches
- Don't push core-java-practice changes when on OOPs branch
- Don't mix changes from different folders in one commit

## Current Git Configuration:

```
Available Branches:
- OOPs (for OOPS/ folder work)
- core-java-practice (for core-java-practice/ folder work)
- main (stable/production)

Remote Branches:
- origin/OOPs
- origin/core-java-practice
- origin/main
```

## Quick Reference:

```bash
# Check current branch
git branch

# Switch branches
git checkout OOPs
git checkout core-java-practice

# See changes before committing
git status

# Add specific folder
git add OOPS/          # For OOPs branch
git add core-java-practice/  # For core-java-practice branch

# Commit and push
git commit -m "Branch: description"
git push origin <branch-name>
```

## Protection Strategy:

The .gitignore file prevents build artifacts from being committed. Only source code (.java files) will be tracked.

