package com.example.kinopoiskup.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0006\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0003\b\u009e\u0001\b\u0086\b\u0018\u00002\u00020\u0001B\u00a9\u0004\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\'\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)\u0012\u000e\b\u0002\u0010+\u001a\b\u0012\u0004\u0012\u00020,0)\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u000106\u00a2\u0006\u0002\u00107J\u0011\u0010\u00a1\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010OJ\u0011\u0010\u00a2\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010OJ\f\u0010\u00a3\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0011\u0010\u00a4\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010OJ\f\u0010\u00a5\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0011\u0010\u00a6\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010OJ\u0011\u0010\u00a7\u0001\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003\u00a2\u0006\u0002\u0010\u007fJ\u0011\u0010\u00a8\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010OJ\f\u0010\u00a9\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0011\u0010\u00aa\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010OJ\f\u0010\u00ab\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u00ac\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0011\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010OJ\f\u0010\u00ae\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0011\u0010\u00af\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010OJ\f\u0010\u00b0\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0011\u0010\u00b1\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010OJ\f\u0010\u00b2\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u00b3\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u00b4\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u00b5\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u00b6\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u00b7\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0011\u0010\u00b8\u0001\u001a\u0004\u0018\u00010#H\u00c6\u0003\u00a2\u0006\u0002\u0010>J\f\u0010\u00b9\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u00ba\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u00bb\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u00bc\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010\u00bd\u0001\u001a\b\u0012\u0004\u0012\u00020*0)H\u00c6\u0003J\u0010\u0010\u00be\u0001\u001a\b\u0012\u0004\u0012\u00020,0)H\u00c6\u0003J\u0011\u0010\u00bf\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010OJ\u0011\u0010\u00c0\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010OJ\u0011\u0010\u00c1\u0001\u001a\u0004\u0018\u00010#H\u00c6\u0003\u00a2\u0006\u0002\u0010>J\f\u0010\u00c2\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0011\u0010\u00c3\u0001\u001a\u0004\u0018\u00010#H\u00c6\u0003\u00a2\u0006\u0002\u0010>J\u0011\u0010\u00c4\u0001\u001a\u0004\u0018\u00010#H\u00c6\u0003\u00a2\u0006\u0002\u0010>J\u0011\u0010\u00c5\u0001\u001a\u0004\u0018\u00010#H\u00c6\u0003\u00a2\u0006\u0002\u0010>J\u0011\u0010\u00c6\u0001\u001a\u0004\u0018\u00010#H\u00c6\u0003\u00a2\u0006\u0002\u0010>J\f\u0010\u00c7\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0011\u0010\u00c8\u0001\u001a\u0004\u0018\u000106H\u00c6\u0003\u00a2\u0006\u0002\u00109J\f\u0010\u00c9\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u00ca\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u00cb\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u00cc\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u00cd\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u00b4\u0004\u0010\u00ce\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\'\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)2\u000e\b\u0002\u0010+\u001a\b\u0012\u0004\u0012\u00020,0)2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010/\u001a\u0004\u0018\u00010#2\n\b\u0002\u00100\u001a\u0004\u0018\u00010#2\n\b\u0002\u00101\u001a\u0004\u0018\u00010#2\n\b\u0002\u00102\u001a\u0004\u0018\u00010#2\n\b\u0002\u00103\u001a\u0004\u0018\u00010#2\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00105\u001a\u0004\u0018\u000106H\u00c6\u0001\u00a2\u0006\u0003\u0010\u00cf\u0001J\u0015\u0010\u00d0\u0001\u001a\u00020#2\t\u0010\u00d1\u0001\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\n\u0010\u00d2\u0001\u001a\u00020\u0003H\u00d6\u0001J\n\u0010\u00d3\u0001\u001a\u00020\u0005H\u00d6\u0001R\u001e\u00105\u001a\u0004\u0018\u000106X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010<\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u00101\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010A\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R$\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER \u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR \u0010\u001f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010G\"\u0004\bK\u0010IR \u0010!\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bL\u0010G\"\u0004\bM\u0010IR\"\u0010.\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010R\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR \u0010\u001d\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bS\u0010G\"\u0004\bT\u0010IR$\u0010+\u001a\b\u0012\u0004\u0012\u00020,0)8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bU\u0010C\"\u0004\bV\u0010ER\"\u00103\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010A\u001a\u0004\bW\u0010>\"\u0004\bX\u0010@R\"\u00102\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010A\u001a\u0004\bY\u0010>\"\u0004\bZ\u0010@R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b[\u0010G\"\u0004\b\\\u0010IR\"\u0010\"\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010A\u001a\u0004\b\"\u0010>\"\u0004\b]\u0010@R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010R\u001a\u0004\b^\u0010O\"\u0004\b_\u0010QR \u00104\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b`\u0010G\"\u0004\ba\u0010IR \u0010\f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bb\u0010G\"\u0004\bc\u0010IR \u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bd\u0010G\"\u0004\be\u0010IR \u0010\b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bf\u0010G\"\u0004\bg\u0010IR \u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bh\u0010G\"\u0004\bi\u0010IR \u0010\t\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bj\u0010G\"\u0004\bk\u0010IR \u0010\n\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bl\u0010G\"\u0004\bm\u0010IR \u0010$\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bn\u0010G\"\u0004\bo\u0010IR \u0010\'\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bp\u0010G\"\u0004\bq\u0010IR \u0010\u0017\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\br\u0010G\"\u0004\bs\u0010IR\"\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010R\u001a\u0004\bt\u0010O\"\u0004\bu\u0010QR \u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bv\u0010G\"\u0004\bw\u0010IR\"\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010R\u001a\u0004\bx\u0010O\"\u0004\by\u0010QR \u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bz\u0010G\"\u0004\b{\u0010IR\"\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010R\u001a\u0004\b|\u0010O\"\u0004\b}\u0010QR%\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0013\n\u0003\u0010\u0082\u0001\u001a\u0004\b~\u0010\u007f\"\u0006\b\u0080\u0001\u0010\u0081\u0001R$\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0002\u0010R\u001a\u0005\b\u0083\u0001\u0010O\"\u0005\b\u0084\u0001\u0010QR\"\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0085\u0001\u0010G\"\u0005\b\u0086\u0001\u0010IR$\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0002\u0010R\u001a\u0005\b\u0087\u0001\u0010O\"\u0005\b\u0088\u0001\u0010QR\"\u0010&\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0089\u0001\u0010G\"\u0005\b\u008a\u0001\u0010IR\"\u0010\u0019\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u008b\u0001\u0010G\"\u0005\b\u008c\u0001\u0010IR$\u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0002\u0010R\u001a\u0005\b\u008d\u0001\u0010O\"\u0005\b\u008e\u0001\u0010QR$\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0002\u0010R\u001a\u0005\b\u008f\u0001\u0010O\"\u0005\b\u0090\u0001\u0010QR$\u0010/\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0002\u0010A\u001a\u0005\b\u0091\u0001\u0010>\"\u0005\b\u0092\u0001\u0010@R\"\u0010 \u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0093\u0001\u0010G\"\u0005\b\u0094\u0001\u0010IR$\u00100\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0002\u0010A\u001a\u0005\b\u0095\u0001\u0010>\"\u0005\b\u0096\u0001\u0010@R\"\u0010\u001e\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0097\u0001\u0010G\"\u0005\b\u0098\u0001\u0010IR$\u0010-\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0002\u0010R\u001a\u0005\b\u0099\u0001\u0010O\"\u0005\b\u009a\u0001\u0010QR\"\u0010%\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u009b\u0001\u0010G\"\u0005\b\u009c\u0001\u0010IR\"\u0010\u001b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u009d\u0001\u0010G\"\u0005\b\u009e\u0001\u0010IR$\u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0002\u0010R\u001a\u0005\b\u009f\u0001\u0010O\"\u0005\b\u00a0\u0001\u0010Q\u00a8\u0006\u00d4\u0001"}, d2 = {"Lcom/example/kinopoiskup/entity/FilmInfoDTO;", "", "kinopoiskId", "", "imdbId", "", "nameRu", "nameEn", "nameOriginal", "posterUrl", "posterUrlPreview", "coverUrl", "logoUrl", "reviewsCount", "ratingGoodReview", "ratingGoodReviewVoteCount", "ratingKinopoisk", "ratingKinopoiskVoteCount", "ratingImdb", "", "ratingImdbVoteCount", "ratingFilmCritics", "ratingFilmCriticsVoteCount", "ratingAwait", "ratingAwaitCount", "ratingRfCritics", "ratingRfCriticsVoteCount", "webUrl", "year", "filmLength", "slogan", "description", "shortDescription", "editorAnnotation", "isTicketsAvailable", "", "productionStatus", "type", "ratingMpaa", "ratingAgeLimits", "countries", "", "Lcom/example/kinopoiskup/entity/Countries;", "genres", "Lcom/example/kinopoiskup/entity/Genres;", "startYear", "endYear", "serial", "shortFilm", "completed", "hasImax", "has3D", "lastSync", "bitmask", "", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;)V", "getBitmask", "()Ljava/lang/Long;", "setBitmask", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getCompleted", "()Ljava/lang/Boolean;", "setCompleted", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getCountries", "()Ljava/util/List;", "setCountries", "(Ljava/util/List;)V", "getCoverUrl", "()Ljava/lang/String;", "setCoverUrl", "(Ljava/lang/String;)V", "getDescription", "setDescription", "getEditorAnnotation", "setEditorAnnotation", "getEndYear", "()Ljava/lang/Integer;", "setEndYear", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getFilmLength", "setFilmLength", "getGenres", "setGenres", "getHas3D", "setHas3D", "getHasImax", "setHasImax", "getImdbId", "setImdbId", "setTicketsAvailable", "getKinopoiskId", "setKinopoiskId", "getLastSync", "setLastSync", "getLogoUrl", "setLogoUrl", "getNameEn", "setNameEn", "getNameOriginal", "setNameOriginal", "getNameRu", "setNameRu", "getPosterUrl", "setPosterUrl", "getPosterUrlPreview", "setPosterUrlPreview", "getProductionStatus", "setProductionStatus", "getRatingAgeLimits", "setRatingAgeLimits", "getRatingAwait", "setRatingAwait", "getRatingAwaitCount", "setRatingAwaitCount", "getRatingFilmCritics", "setRatingFilmCritics", "getRatingFilmCriticsVoteCount", "setRatingFilmCriticsVoteCount", "getRatingGoodReview", "setRatingGoodReview", "getRatingGoodReviewVoteCount", "setRatingGoodReviewVoteCount", "getRatingImdb", "()Ljava/lang/Double;", "setRatingImdb", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getRatingImdbVoteCount", "setRatingImdbVoteCount", "getRatingKinopoisk", "setRatingKinopoisk", "getRatingKinopoiskVoteCount", "setRatingKinopoiskVoteCount", "getRatingMpaa", "setRatingMpaa", "getRatingRfCritics", "setRatingRfCritics", "getRatingRfCriticsVoteCount", "setRatingRfCriticsVoteCount", "getReviewsCount", "setReviewsCount", "getSerial", "setSerial", "getShortDescription", "setShortDescription", "getShortFilm", "setShortFilm", "getSlogan", "setSlogan", "getStartYear", "setStartYear", "getType", "setType", "getWebUrl", "setWebUrl", "getYear", "setYear", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;)Lcom/example/kinopoiskup/entity/FilmInfoDTO;", "equals", "other", "hashCode", "toString", "app_debug"})
public final class FilmInfoDTO {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "kinopoiskId")
    private java.lang.Integer kinopoiskId;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "imdbId")
    private java.lang.String imdbId;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "nameRu")
    private java.lang.String nameRu;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "nameEn")
    private java.lang.String nameEn;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "nameOriginal")
    private java.lang.String nameOriginal;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "posterUrl")
    private java.lang.String posterUrl;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "posterUrlPreview")
    private java.lang.String posterUrlPreview;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "coverUrl")
    private java.lang.String coverUrl;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "logoUrl")
    private java.lang.String logoUrl;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "reviewsCount")
    private java.lang.Integer reviewsCount;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "ratingGoodReview")
    private java.lang.String ratingGoodReview;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "ratingGoodReviewVoteCount")
    private java.lang.Integer ratingGoodReviewVoteCount;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "ratingKinopoisk")
    private java.lang.String ratingKinopoisk;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "ratingKinopoiskVoteCount")
    private java.lang.Integer ratingKinopoiskVoteCount;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "ratingImdb")
    private java.lang.Double ratingImdb;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "ratingImdbVoteCount")
    private java.lang.Integer ratingImdbVoteCount;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "ratingFilmCritics")
    private java.lang.String ratingFilmCritics;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "ratingFilmCriticsVoteCount")
    private java.lang.Integer ratingFilmCriticsVoteCount;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "ratingAwait")
    private java.lang.String ratingAwait;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "ratingAwaitCount")
    private java.lang.Integer ratingAwaitCount;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "ratingRfCritics")
    private java.lang.String ratingRfCritics;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "ratingRfCriticsVoteCount")
    private java.lang.Integer ratingRfCriticsVoteCount;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "webUrl")
    private java.lang.String webUrl;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "year")
    private java.lang.Integer year;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "filmLength")
    private java.lang.String filmLength;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "slogan")
    private java.lang.String slogan;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "description")
    private java.lang.String description;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "shortDescription")
    private java.lang.String shortDescription;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "editorAnnotation")
    private java.lang.String editorAnnotation;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "isTicketsAvailable")
    private java.lang.Boolean isTicketsAvailable;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "productionStatus")
    private java.lang.String productionStatus;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "type")
    private java.lang.String type;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "ratingMpaa")
    private java.lang.String ratingMpaa;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "ratingAgeLimits")
    private java.lang.String ratingAgeLimits;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "countries")
    private java.util.List<com.example.kinopoiskup.entity.Countries> countries;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "genres")
    private java.util.List<com.example.kinopoiskup.entity.Genres> genres;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "startYear")
    private java.lang.Integer startYear;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "endYear")
    private java.lang.Integer endYear;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "serial")
    private java.lang.Boolean serial;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "shortFilm")
    private java.lang.Boolean shortFilm;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "completed")
    private java.lang.Boolean completed;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "hasImax")
    private java.lang.Boolean hasImax;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "has3D")
    private java.lang.Boolean has3D;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "lastSync")
    private java.lang.String lastSync;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Long bitmask;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.kinopoiskup.entity.FilmInfoDTO copy(@org.jetbrains.annotations.Nullable()
    java.lang.Integer kinopoiskId, @org.jetbrains.annotations.Nullable()
    java.lang.String imdbId, @org.jetbrains.annotations.Nullable()
    java.lang.String nameRu, @org.jetbrains.annotations.Nullable()
    java.lang.String nameEn, @org.jetbrains.annotations.Nullable()
    java.lang.String nameOriginal, @org.jetbrains.annotations.Nullable()
    java.lang.String posterUrl, @org.jetbrains.annotations.Nullable()
    java.lang.String posterUrlPreview, @org.jetbrains.annotations.Nullable()
    java.lang.String coverUrl, @org.jetbrains.annotations.Nullable()
    java.lang.String logoUrl, @org.jetbrains.annotations.Nullable()
    java.lang.Integer reviewsCount, @org.jetbrains.annotations.Nullable()
    java.lang.String ratingGoodReview, @org.jetbrains.annotations.Nullable()
    java.lang.Integer ratingGoodReviewVoteCount, @org.jetbrains.annotations.Nullable()
    java.lang.String ratingKinopoisk, @org.jetbrains.annotations.Nullable()
    java.lang.Integer ratingKinopoiskVoteCount, @org.jetbrains.annotations.Nullable()
    java.lang.Double ratingImdb, @org.jetbrains.annotations.Nullable()
    java.lang.Integer ratingImdbVoteCount, @org.jetbrains.annotations.Nullable()
    java.lang.String ratingFilmCritics, @org.jetbrains.annotations.Nullable()
    java.lang.Integer ratingFilmCriticsVoteCount, @org.jetbrains.annotations.Nullable()
    java.lang.String ratingAwait, @org.jetbrains.annotations.Nullable()
    java.lang.Integer ratingAwaitCount, @org.jetbrains.annotations.Nullable()
    java.lang.String ratingRfCritics, @org.jetbrains.annotations.Nullable()
    java.lang.Integer ratingRfCriticsVoteCount, @org.jetbrains.annotations.Nullable()
    java.lang.String webUrl, @org.jetbrains.annotations.Nullable()
    java.lang.Integer year, @org.jetbrains.annotations.Nullable()
    java.lang.String filmLength, @org.jetbrains.annotations.Nullable()
    java.lang.String slogan, @org.jetbrains.annotations.Nullable()
    java.lang.String description, @org.jetbrains.annotations.Nullable()
    java.lang.String shortDescription, @org.jetbrains.annotations.Nullable()
    java.lang.String editorAnnotation, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isTicketsAvailable, @org.jetbrains.annotations.Nullable()
    java.lang.String productionStatus, @org.jetbrains.annotations.Nullable()
    java.lang.String type, @org.jetbrains.annotations.Nullable()
    java.lang.String ratingMpaa, @org.jetbrains.annotations.Nullable()
    java.lang.String ratingAgeLimits, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.kinopoiskup.entity.Countries> countries, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.kinopoiskup.entity.Genres> genres, @org.jetbrains.annotations.Nullable()
    java.lang.Integer startYear, @org.jetbrains.annotations.Nullable()
    java.lang.Integer endYear, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean serial, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean shortFilm, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean completed, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean hasImax, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean has3D, @org.jetbrains.annotations.Nullable()
    java.lang.String lastSync, @org.jetbrains.annotations.Nullable()
    java.lang.Long bitmask) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public FilmInfoDTO() {
        super();
    }
    
    public FilmInfoDTO(@org.jetbrains.annotations.Nullable()
    java.lang.Integer kinopoiskId, @org.jetbrains.annotations.Nullable()
    java.lang.String imdbId, @org.jetbrains.annotations.Nullable()
    java.lang.String nameRu, @org.jetbrains.annotations.Nullable()
    java.lang.String nameEn, @org.jetbrains.annotations.Nullable()
    java.lang.String nameOriginal, @org.jetbrains.annotations.Nullable()
    java.lang.String posterUrl, @org.jetbrains.annotations.Nullable()
    java.lang.String posterUrlPreview, @org.jetbrains.annotations.Nullable()
    java.lang.String coverUrl, @org.jetbrains.annotations.Nullable()
    java.lang.String logoUrl, @org.jetbrains.annotations.Nullable()
    java.lang.Integer reviewsCount, @org.jetbrains.annotations.Nullable()
    java.lang.String ratingGoodReview, @org.jetbrains.annotations.Nullable()
    java.lang.Integer ratingGoodReviewVoteCount, @org.jetbrains.annotations.Nullable()
    java.lang.String ratingKinopoisk, @org.jetbrains.annotations.Nullable()
    java.lang.Integer ratingKinopoiskVoteCount, @org.jetbrains.annotations.Nullable()
    java.lang.Double ratingImdb, @org.jetbrains.annotations.Nullable()
    java.lang.Integer ratingImdbVoteCount, @org.jetbrains.annotations.Nullable()
    java.lang.String ratingFilmCritics, @org.jetbrains.annotations.Nullable()
    java.lang.Integer ratingFilmCriticsVoteCount, @org.jetbrains.annotations.Nullable()
    java.lang.String ratingAwait, @org.jetbrains.annotations.Nullable()
    java.lang.Integer ratingAwaitCount, @org.jetbrains.annotations.Nullable()
    java.lang.String ratingRfCritics, @org.jetbrains.annotations.Nullable()
    java.lang.Integer ratingRfCriticsVoteCount, @org.jetbrains.annotations.Nullable()
    java.lang.String webUrl, @org.jetbrains.annotations.Nullable()
    java.lang.Integer year, @org.jetbrains.annotations.Nullable()
    java.lang.String filmLength, @org.jetbrains.annotations.Nullable()
    java.lang.String slogan, @org.jetbrains.annotations.Nullable()
    java.lang.String description, @org.jetbrains.annotations.Nullable()
    java.lang.String shortDescription, @org.jetbrains.annotations.Nullable()
    java.lang.String editorAnnotation, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isTicketsAvailable, @org.jetbrains.annotations.Nullable()
    java.lang.String productionStatus, @org.jetbrains.annotations.Nullable()
    java.lang.String type, @org.jetbrains.annotations.Nullable()
    java.lang.String ratingMpaa, @org.jetbrains.annotations.Nullable()
    java.lang.String ratingAgeLimits, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.kinopoiskup.entity.Countries> countries, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.kinopoiskup.entity.Genres> genres, @org.jetbrains.annotations.Nullable()
    java.lang.Integer startYear, @org.jetbrains.annotations.Nullable()
    java.lang.Integer endYear, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean serial, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean shortFilm, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean completed, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean hasImax, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean has3D, @org.jetbrains.annotations.Nullable()
    java.lang.String lastSync, @org.jetbrains.annotations.Nullable()
    java.lang.Long bitmask) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getKinopoiskId() {
        return null;
    }
    
    public final void setKinopoiskId(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getImdbId() {
        return null;
    }
    
    public final void setImdbId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getNameRu() {
        return null;
    }
    
    public final void setNameRu(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getNameEn() {
        return null;
    }
    
    public final void setNameEn(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getNameOriginal() {
        return null;
    }
    
    public final void setNameOriginal(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPosterUrl() {
        return null;
    }
    
    public final void setPosterUrl(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPosterUrlPreview() {
        return null;
    }
    
    public final void setPosterUrlPreview(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCoverUrl() {
        return null;
    }
    
    public final void setCoverUrl(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLogoUrl() {
        return null;
    }
    
    public final void setLogoUrl(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getReviewsCount() {
        return null;
    }
    
    public final void setReviewsCount(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRatingGoodReview() {
        return null;
    }
    
    public final void setRatingGoodReview(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getRatingGoodReviewVoteCount() {
        return null;
    }
    
    public final void setRatingGoodReviewVoteCount(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRatingKinopoisk() {
        return null;
    }
    
    public final void setRatingKinopoisk(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getRatingKinopoiskVoteCount() {
        return null;
    }
    
    public final void setRatingKinopoiskVoteCount(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getRatingImdb() {
        return null;
    }
    
    public final void setRatingImdb(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getRatingImdbVoteCount() {
        return null;
    }
    
    public final void setRatingImdbVoteCount(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRatingFilmCritics() {
        return null;
    }
    
    public final void setRatingFilmCritics(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getRatingFilmCriticsVoteCount() {
        return null;
    }
    
    public final void setRatingFilmCriticsVoteCount(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component19() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRatingAwait() {
        return null;
    }
    
    public final void setRatingAwait(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component20() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getRatingAwaitCount() {
        return null;
    }
    
    public final void setRatingAwaitCount(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component21() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRatingRfCritics() {
        return null;
    }
    
    public final void setRatingRfCritics(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component22() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getRatingRfCriticsVoteCount() {
        return null;
    }
    
    public final void setRatingRfCriticsVoteCount(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component23() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getWebUrl() {
        return null;
    }
    
    public final void setWebUrl(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component24() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getYear() {
        return null;
    }
    
    public final void setYear(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component25() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFilmLength() {
        return null;
    }
    
    public final void setFilmLength(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component26() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSlogan() {
        return null;
    }
    
    public final void setSlogan(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component27() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDescription() {
        return null;
    }
    
    public final void setDescription(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component28() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getShortDescription() {
        return null;
    }
    
    public final void setShortDescription(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component29() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getEditorAnnotation() {
        return null;
    }
    
    public final void setEditorAnnotation(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component30() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean isTicketsAvailable() {
        return null;
    }
    
    public final void setTicketsAvailable(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component31() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getProductionStatus() {
        return null;
    }
    
    public final void setProductionStatus(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component32() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getType() {
        return null;
    }
    
    public final void setType(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component33() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRatingMpaa() {
        return null;
    }
    
    public final void setRatingMpaa(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component34() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRatingAgeLimits() {
        return null;
    }
    
    public final void setRatingAgeLimits(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.kinopoiskup.entity.Countries> component35() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.kinopoiskup.entity.Countries> getCountries() {
        return null;
    }
    
    public final void setCountries(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.kinopoiskup.entity.Countries> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.kinopoiskup.entity.Genres> component36() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.kinopoiskup.entity.Genres> getGenres() {
        return null;
    }
    
    public final void setGenres(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.kinopoiskup.entity.Genres> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component37() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getStartYear() {
        return null;
    }
    
    public final void setStartYear(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component38() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getEndYear() {
        return null;
    }
    
    public final void setEndYear(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component39() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getSerial() {
        return null;
    }
    
    public final void setSerial(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component40() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getShortFilm() {
        return null;
    }
    
    public final void setShortFilm(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component41() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getCompleted() {
        return null;
    }
    
    public final void setCompleted(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component42() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getHasImax() {
        return null;
    }
    
    public final void setHasImax(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component43() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getHas3D() {
        return null;
    }
    
    public final void setHas3D(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component44() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLastSync() {
        return null;
    }
    
    public final void setLastSync(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component45() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getBitmask() {
        return null;
    }
    
    public final void setBitmask(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
}