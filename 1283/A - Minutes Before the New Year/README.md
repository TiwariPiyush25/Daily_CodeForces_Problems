<h3><a href="https://codeforces.com/contest/1283/problem/A" target="_blank" rel="noopener noreferrer">Minutes Before the New Year</a></h3>

<div class="header"><div class="title">A. Minutes Before the New Year</div><div class="time-limit"><div class="property-title">time limit per test</div>1 second</div><div class="memory-limit"><div class="property-title">memory limit per test</div>256 megabytes</div><div class="input-file input-standard"><div class="property-title">input</div>standard input</div><div class="output-file output-standard"><div class="property-title">output</div>standard output</div></div><div><p>New Year is coming and you are excited to know how many minutes remain before the New Year. You know that currently the clock shows $$$h$$$ hours and $$$m$$$ minutes, where $$$0 \le hh  \lt  24$$$ and $$$0 \le mm  \lt  60$$$. <span class="tex-font-style-it">We use 24-hour time format!</span></p><p>Your task is to find the number of minutes before the New Year. You know that New Year comes when the clock shows $$$0$$$ hours and $$$0$$$ minutes.</p><p>You have to answer $$$t$$$ independent test cases.</p></div><div class="input-specification"><div class="section-title">Input</div><p>The first line of the input contains one integer $$$t$$$ ($$$1 \le t \le 1439$$$) — the number of test cases.</p><p>The following $$$t$$$ lines describe test cases. The $$$i$$$-th line contains the time as two integers $$$h$$$ and $$$m$$$ ($$$0 \le h  \lt  24$$$, $$$0 \le m  \lt  60$$$). It is guaranteed that this time is <span class="tex-font-style-bf">not</span> a midnight, i.e. the following two conditions can't be met at the same time: $$$h=0$$$ and $$$m=0$$$. It is guaranteed that both $$$h$$$ and $$$m$$$ are given without leading zeros.</p></div><div class="output-specification"><div class="section-title">Output</div><p>For each test case, print the answer on it — the number of minutes before the New Year.</p></div><div class="sample-tests"><div class="section-title">Example</div><div class="sample-test"><div class="input"><div class="title">Input<div title="Copy" data-clipboard-target="#id005246661606469227" id="id005284273283048032" class="input-output-copier">Copy</div></div><pre id="id005246661606469227">5
23 55
23 0
0 1
4 20
23 59
</pre></div><div class="output"><div class="title">Output<div title="Copy" data-clipboard-target="#id006726953569788845" id="id007410260320590979" class="input-output-copier">Copy</div></div><pre id="id006726953569788845">5
60
1439
1180
1
</pre></div></div></div>