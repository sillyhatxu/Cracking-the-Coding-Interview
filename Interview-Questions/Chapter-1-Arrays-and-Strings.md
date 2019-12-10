# Chapter 1 Arrays and Strings

> Hopefully, all readers of this book are familiar with arrays and strings, so we won't bore you with such details. Instead, we'll focus on some of the more common techniques and issues with these data structures.
>
> Please note that array questions and string questions are often interchangeable. That is a question that this book states using an array may be asked instead as a string question, and vice versa

希望所有这本书的读者，都熟悉数组和字符串，所以我们不会用这些细节来烦你。相反，我们将集中讨论这些数据结构的一些更常见的技术和问题。

请注意，数组问题和字符串问题经常可互换的。那是一个问题，这本书声明使用数组可能会被问作为一个字符串的问题，反之亦然

## Hast Table

A hash table is a data structure that maps keys to values for highly efficient lookup. There are a number of ways of implementing this. Here, we will describe a simple but common implementation.
In this simple implementation, we use an array of linked lists and a hash code function. To insert a key (which might be a string or essentially any other data type) and value, we do the following:
1. First, compute the key's hash code, which will usually be an i n t or long. Note that two different keys could have the same hash code, as there may be an infinite number of keys and a finite number of ints.
2. Then, map the hash code to an index in the array. This could be done with something like hash ( k e y ) % array_length.Two different hash codes could, ofcourse, map to the same index.
3. At this index, there is a linked list of keys and values. Store the key and value in this index. We must use a linked list because of collisions: you could have two different keys with the same hash code, or two different hash codes that map to the same index.
To retrieve the value pair by its key, you repeat this process. Compute the hash code from the key, and then compute the index from the hash code. Then, search through the linked list for the value with this key.
If the number of collisions is very high, the worst case runtime is 0(N), where N is the number of keys. However, we generally assume a good implementation that keeps collisions to a minimum, in which case the lookup time is 0( 1).

| Vocabulary        | Translation           |
| :------------- |:-------------|
| hopefully | adv. 有希望地，有前途地 |
| familiar | adj. 熟悉的；常见的 |
| bore | vt. 钻孔；使烦扰 |
| some of the more common | 比较常见的 |
| technique | n. 技巧，技术；手法 |
| data structures | 数据结构 |
| interchangeable | adj. 可互换的；可交换的；可交替的 |
| vice versa | 反之亦然 |
| xxxxxxxxxxxxxx | xxxxxxxxx |
| xxxxxxxxxxxxxx | xxxxxxxxx |
| xxxxxxxxxxxxxx | xxxxxxxxx |
| xxxxxxxxxxxxxx | xxxxxxxxx |