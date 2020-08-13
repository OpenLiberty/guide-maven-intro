# Contributing to Open Liberty Guides

Anyone can contribute to the Open Liberty guides and we welcome your contributions!

There are multiple ways to contribute: report bugs, fix bugs, contribute code, improve upon documentation, etc. 

## Raising Issues

Please raise any bug reports on the [Open Liberty guide's repository's](https://github.com/OpenLiberty/guide-maven-intro/issues). For new topics, large updates to existing guides, or general suggestions and ideas, report your issue on the [Open Liberty common guides repository](https://github.com/OpenLiberty/guides-common/issues). Be sure to search the list to see if your issue has already been raised.

A good bug report is one that makes it easy for everyone to understand what you were trying to do and what went wrong. Provide as much context as possible so we can try to recreate the issue.

## Contributions 

Contributing to the Open Liberty guides is simple. All you need to do is create your own branch to include your contribution(s). If you want to make updates to existing guides, create a new branch and open a pull request to the `qa` (quality assurance) branch. We first merge pull requests to the `qa` branch for staging before we merge to the `master` branch for publishing.

After cloning the guide repository, create a new branch:

```
git checkout -b [new-branch]
```

### Text or Content Contribution

If you are contributing text of content changes or trivial code changes via a pull request, sign your work. The sign-off is a line at the end of the commit message that certifies that you wrote it or otherwise have the right to pass it on as an open source patch. The process is simple: if you can certify the [Developer Certificate of Origin (DCO)](https://developercertificate.org)),

then add a line to the end of the Git commit message:

```
Signed-off-by: Jane Williams <jane.williams@gmail.com>
```

Use your real name when you sign. We can't accept pseudonyms or anonymous contributions.

Many Git UI tools have support for adding the `Signed-off-by` line to the end of your commit message. This line can be automatically added by the `git commit` command by using the `-s` option.

To open a pull request to the `qa` branch, follow the official [git documentation](https://git-scm.com/docs/git-request-pull).

### Code Contribution

If you are contributing code changes via a pull request for anything except trivial changes, you must signoff on the [Individual Contributor License Agreement](https://github.com/OpenLiberty/open-liberty/blob/master/cla/open-liberty-cla-individual.pdf) If you are doing this as part of your job you may also wish to get your employer to sign a CCLA [Corporate Contributor License Agreement](https://github.com/OpenLiberty/open-liberty/blob/master/cla/open-liberty-cla-corporate.pdf). Instructions how to sign and submit these agreements are located at the top of each document. Trivial changes such as Typos, redundant spaces, minor formatting and spelling errors will be labeled as "CLA trivial", and don't require a signed CLA for consideration.

After we obtain the signed CLA, you are welcome to open a pull request, and the team will be notified for review. We ask you follow these steps through the submission process.

1. Open PR's against the `qa` branch, as we ensure changes pass our series of verification buckets before pushing to master.
2. A label will be added "CLA signed" or "CLA trivial" depending on the nature of the change.
3. A team of "reviewers" will be notified, will perform a review, and if approved will invoke a full integration build.
4. Based on the results of the build, and if further review is needed, more discussion will occur.
5. If the reviewer is satisfied with the results, and agrees to the change, the PR will be merged to `qa` branch, otherwise the PR will be closed with an explaination and suggestion for followup.


## Questions and Concerns

If you have any questions or concerns about the guides, you can find Open Liberty on [Gitter](https://gitter.im/OpenLiberty/) and post any inquires about the guides to one of the rooms. You can also join the Open Liberty group on [Group.io](https://groups.io/g/openliberty) to discuss any issues you may be facing.
