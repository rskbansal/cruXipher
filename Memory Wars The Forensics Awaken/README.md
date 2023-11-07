# Memory Wars The Forensics Awaken

```
A long time ago, in a galaxy far, far away, the dark side of the Force has corrupted a memory dump from a critical system in the Empire. As a skilled memory forensics expert, your mission is to bring balance to the memory and recover the hidden flag. In this memory dump, you will encounter several processes, each with their own "Force" and "Dark Side" characteristics. The memory addresses might be scrambled, but the processes themselves hold the key to revealing the flag. Amidst this memory chaos, look for traces of history. The Jedi Knight process, in particular, might contain hints related to significant events in the history of the Force. Your mission is to identify and analyze these processes, find their hidden connections, and piece together the flag. May the Force be with you on this memory hunt The flag is in the format cruXipher{<flag>}
```

Download the memory.dmp file and use strings while grepping Sky@ubuntu1

` strings memory.dmp | grep Sky@ubuntu1 `

Flag : `cruXipher{1_h4v3_br0ught_p34ce_fr33d0m_justic3_4nd_s3cur1ty_t0_my_new_empire}`