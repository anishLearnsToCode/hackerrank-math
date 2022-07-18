# Contributing Guidelines

This project aims to create a common source from all Mathematics questions on HackerRank and values every single 
contribution made by the community.

We aim to solve all questions in the HackerRank Mathematics domain in as many languages as possible to show the 
different code styles and approaches that can be used to solve the same problem.
 
Contributing is very simple, simply identify a question from the [README](README.md) file that has yet to be solved in
a programming language of your choice. 

Solve that question and make sure that all tests pass on HackerRank and then create a pull request with the 
added solution and updated readme.
  
## Pull Request Process

1. Fork this repository to your github account and then clone your forked repository to your machine.
2. Say you solve some problem called __cars-and-trucks__ in using your favorite programming language,
   say Python then simple add a new file called
   `cars-and-trucks.py` in the `python` directory.
3. In the [README](README.md) file, do not make any modification. The README file will be modified 
   by __@anishLearnsToCode__.


## Git Workflow
1. Fork this repo

2. Add this repo as the remote:
````bash
git remote add anish https://github.com/anishLearnsToCode/hackerrank-math.git
git remote 
````

3. Always pull main from this repo and program in new branches:
````bash
git checkout main 
git pull anish main
git push origin main
git checkout -b new-feature
```` 

4. Push your new branch onto your repo and create a Pull Request from GitHub 
````bash
git push -u origin new-feature
````
and create a pull request

5. Update __main__ branch once the PR is approved and rebase any other feature branches on top of it.
````bash
git checkout main
git pull anish main
git checkout feature-2
git rebase main
```` 
