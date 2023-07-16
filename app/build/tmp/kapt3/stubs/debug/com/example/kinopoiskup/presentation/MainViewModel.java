package com.example.kinopoiskup.presentation;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u008a\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010%\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\t\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0012\u0010\u00cc\u0001\u001a\u00030\u00cd\u00012\b\u0010\u00ce\u0001\u001a\u00030\u00cf\u0001J\u0011\u0010\u00d0\u0001\u001a\u00030\u00cd\u00012\u0007\u00105\u001a\u00030\u00d1\u0001J\u0012\u0010\u00d2\u0001\u001a\u00030\u00cd\u00012\b\u0010\u00d3\u0001\u001a\u00030\u00cf\u0001J\b\u0010\u00d4\u0001\u001a\u00030\u00cd\u0001J\u0011\u0010\u00d5\u0001\u001a\u00030\u00cd\u00012\u0007\u0010\u00d6\u0001\u001a\u00020\u000fJ\b\u0010\u00d7\u0001\u001a\u00030\u00cd\u0001J\b\u0010\u00d8\u0001\u001a\u00030\u00cd\u0001J\u0014\u0010\u00d9\u0001\u001a\u00030\u00cd\u0001H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u00da\u0001J\u0014\u0010\u00db\u0001\u001a\u00030\u00cd\u0001H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u00da\u0001J\u001a\u0010\u00dc\u0001\u001a\u00030\u00cd\u00012\u0007\u0010\u00dd\u0001\u001a\u00020\u000f2\u0007\u0010\u00de\u0001\u001a\u00020\u0012J\u0011\u0010\u00df\u0001\u001a\u00030\u00cd\u00012\u0007\u0010\u00e0\u0001\u001a\u00020\u000fJ\b\u0010\u00e1\u0001\u001a\u00030\u00cd\u0001J\b\u0010\u00e2\u0001\u001a\u00030\u00cd\u0001J\u0015\u0010\u00e3\u0001\u001a\u0010\u0012\f\u0012\n\u0012\u0005\u0012\u00030\u00cf\u00010\u00e4\u000102J\u001e\u0010\u00e5\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020`0\u00e4\u0001022\b\u0010\u00e6\u0001\u001a\u00030\u00e7\u0001J\u001e\u0010\u00e8\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020~0\u00e4\u0001022\b\u0010\u00e6\u0001\u001a\u00030\u00e7\u0001J\u001e\u0010\u00e9\u0001\u001a\u0010\u0012\f\u0012\n\u0012\u0005\u0012\u00030\u00ea\u00010\u00e4\u0001022\u0007\u0010\u00eb\u0001\u001a\u00020\u000fJ\b\u0010\u00ec\u0001\u001a\u00030\u00cd\u0001J#\u0010\u00ed\u0001\u001a\u00030\u00cd\u00012\u0007\u0010\u00ee\u0001\u001a\u00020\u000f2\u0007\u0010\u00ef\u0001\u001a\u00020\u000f2\u0007\u0010\u00f0\u0001\u001a\u00020\u000fJ#\u0010\u00f1\u0001\u001a\u00030\u00cd\u00012\r\u0010\u00f2\u0001\u001a\b\u0012\u0004\u0012\u00020`0\u001fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u00f3\u0001J\b\u0010\u00f4\u0001\u001a\u00030\u00cd\u0001J\u001a\u0010\u00f5\u0001\u001a\u00030\u00cd\u00012\u0007\u0010\u00ce\u0001\u001a\u00020\u000f2\u0007\u0010\u00f6\u0001\u001a\u00020\u000fJ\u0011\u0010\u00f7\u0001\u001a\u00030\u00cd\u00012\u0007\u0010\u00f8\u0001\u001a\u00020\u0012J\u001a\u0010\u00f9\u0001\u001a\u00030\u00cd\u00012\u0007\u0010\u00ce\u0001\u001a\u00020\u000b2\u0007\u0010\u00f6\u0001\u001a\u00020\u000fJ\b\u0010\u00fa\u0001\u001a\u00030\u00cd\u0001J#\u0010\u00fb\u0001\u001a\u00030\u00cd\u00012\u0007\u0010\u00ee\u0001\u001a\u00020\u000f2\u0007\u0010\u00ef\u0001\u001a\u00020\u000f2\u0007\u0010\u00f0\u0001\u001a\u00020\u000fJ\u001a\u0010\u00fc\u0001\u001a\u00030\u00cd\u00012\u0007\u0010\u00fd\u0001\u001a\u00020\u000b2\u0007\u0010\u00ce\u0001\u001a\u00020\u000fJ\u001a\u0010\u00fe\u0001\u001a\u00030\u00cd\u00012\u0007\u0010\u00fd\u0001\u001a\u00020\u000b2\u0007\u0010\u00ce\u0001\u001a\u00020\u000fJ\u001b\u0010\u00ff\u0001\u001a\u00030\u00cd\u00012\u0007\u0010\u00dd\u0001\u001a\u00020\u000f2\b\u0010\u0080\u0002\u001a\u00030\u0081\u0002J\u000b\u0010\u0082\u0002\u001a\u00020\u000b*\u00020\u000bR\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001e\u0010%\u001a\u0004\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010*\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R\u001c\u0010+\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u00100\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u00101\u001a\b\u0012\u0004\u0012\u00020\u000b02\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u00104R#\u00105\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e06\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u001a\u00109\u001a\u00020:X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010?\u001a\b\u0012\u0004\u0012\u00020\u000b0@X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010E\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u001e\u0010F\u001a\u0004\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010*\u001a\u0004\bG\u0010\'\"\u0004\bH\u0010)R\u001c\u0010I\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010-\"\u0004\bK\u0010/R \u0010L\u001a\b\u0012\u0004\u0012\u00020M0\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bN\u0010\"\"\u0004\bO\u0010$R\u001a\u0010P\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u001a\u0010U\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bU\u0010R\"\u0004\bV\u0010TR\u0017\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00120X\u00a2\u0006\b\n\u0000\u001a\u0004\bW\u0010YR\u001a\u0010Z\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010R\"\u0004\b[\u0010TR\u001a\u0010\\\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010R\"\u0004\b]\u0010TR \u0010^\u001a\b\u0012\u0004\u0012\u00020`0_X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\ba\u0010\"\"\u0004\bb\u0010$R\u0014\u0010c\u001a\b\u0012\u0004\u0012\u00020d0_X\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010e\u001a\b\u0012\u0004\u0012\u00020d0_X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bf\u0010\"\"\u0004\bg\u0010$R\u0014\u0010h\u001a\b\u0012\u0004\u0012\u00020d0_X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010i\u001a\b\u0012\u0004\u0012\u00020`0\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010j\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bk\u0010\u0018\"\u0004\bl\u0010\u001aR\u001a\u0010m\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bn\u0010\u0018\"\u0004\bo\u0010\u001aR\u001e\u0010p\u001a\u0004\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010*\u001a\u0004\bq\u0010\'\"\u0004\br\u0010)R\u001a\u0010s\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bt\u0010\u0018\"\u0004\bu\u0010\u001aR&\u0010v\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000f0wX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R\u0014\u0010|\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\'\u0010}\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020~0\u001f0_X\u0086\u000e\u00a2\u0006\u000f\n\u0000\u001a\u0004\b\u007f\u0010\"\"\u0005\b\u0080\u0001\u0010$R\u001c\u0010\u0081\u0001\u001a\n\u0012\u0005\u0012\u00030\u0083\u00010\u0082\u0001\u00a2\u0006\n\n\u0000\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0015\u0010\u0086\u0001\u001a\b\u0012\u0004\u0012\u00020d0_X\u0082\u000e\u00a2\u0006\u0002\n\u0000R!\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010*\u001a\u0005\b\u0088\u0001\u0010\'\"\u0005\b\u0089\u0001\u0010)R!\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010*\u001a\u0005\b\u008b\u0001\u0010\'\"\u0005\b\u008c\u0001\u0010)R\u0019\u0010\u008d\u0001\u001a\b\u0012\u0004\u0012\u00020\u001202\u00a2\u0006\t\n\u0000\u001a\u0005\b\u008e\u0001\u00104R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\u008f\u0001\u001a\t\u0012\u0004\u0012\u00020:0\u0090\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001\"\u0006\b\u0093\u0001\u0010\u0094\u0001R,\u0010\u0095\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020d0\u001f0\u0090\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u0096\u0001\u0010\u0092\u0001\"\u0006\b\u0097\u0001\u0010\u0094\u0001R,\u0010\u0098\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020d0\u001f0\u0090\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u0099\u0001\u0010\u0092\u0001\"\u0006\b\u009a\u0001\u0010\u0094\u0001R,\u0010\u009b\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020d0\u001f0\u0090\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u009c\u0001\u0010\u0092\u0001\"\u0006\b\u009d\u0001\u0010\u0094\u0001R,\u0010\u009e\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020d0\u001f0\u0090\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u009f\u0001\u0010\u0092\u0001\"\u0006\b\u00a0\u0001\u0010\u0094\u0001R,\u0010\u00a1\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020`0\u001f0\u0090\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00a2\u0001\u0010\u0092\u0001\"\u0006\b\u00a3\u0001\u0010\u0094\u0001R$\u0010\u00a4\u0001\u001a\t\u0012\u0005\u0012\u00030\u00a5\u00010\u001fX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00a6\u0001\u0010\"\"\u0005\b\u00a7\u0001\u0010$R#\u0010\u00a8\u0001\u001a\b\u0012\u0004\u0012\u00020`0_X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00a9\u0001\u0010\"\"\u0005\b\u00aa\u0001\u0010$R%\u0010\u00ab\u0001\u001a\b\u0012\u0004\u0012\u00020\u000b0@X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010E\u001a\u0005\b\u00ac\u0001\u0010B\"\u0005\b\u00ad\u0001\u0010DR$\u0010\u00ae\u0001\u001a\t\u0012\u0005\u0012\u00030\u00af\u00010_X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00b0\u0001\u0010\"\"\u0005\b\u00b1\u0001\u0010$R\u0010\u0010\u00b2\u0001\u001a\u00030\u00b3\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000R#\u0010\u00b4\u0001\u001a\b\u0012\u0004\u0012\u00020`0_X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00b5\u0001\u0010\"\"\u0005\b\u00b6\u0001\u0010$R#\u0010\u00b7\u0001\u001a\b\u0012\u0004\u0012\u00020`0_X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00b8\u0001\u0010\"\"\u0005\b\u00b9\u0001\u0010$R\'\u0010\u00ba\u0001\u001a\n\u0012\u0005\u0012\u00030\u00b3\u00010\u0090\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00bb\u0001\u0010\u0092\u0001\"\u0006\b\u00bc\u0001\u0010\u0094\u0001R%\u0010\u00bd\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0_X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00be\u0001\u0010\"\"\u0005\b\u00bf\u0001\u0010$R!\u0010\u00c0\u0001\u001a\u0004\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010*\u001a\u0005\b\u00c1\u0001\u0010\'\"\u0005\b\u00c2\u0001\u0010)R\u0016\u0010\u00c3\u0001\u001a\t\u0012\u0005\u0012\u00030\u0083\u000102X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u00c4\u0001\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00c5\u0001\u0010-\"\u0005\b\u00c6\u0001\u0010/R\u001f\u0010\u00c7\u0001\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00c8\u0001\u0010-\"\u0005\b\u00c9\u0001\u0010/R\u0019\u0010\u00ca\u0001\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001f\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00cb\u0001\u0010\"\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0083\u0002"}, d2 = {"Lcom/example/kinopoiskup/presentation/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "dataStore", "Lcom/example/kinopoiskup/data/DataStoreManager;", "dao", "Lcom/example/kinopoiskup/entity/CollectionDao;", "repository", "Lcom/example/kinopoiskup/data/MainRepository;", "(Lcom/example/kinopoiskup/data/DataStoreManager;Lcom/example/kinopoiskup/entity/CollectionDao;Lcom/example/kinopoiskup/data/MainRepository;)V", "_error", "Lkotlinx/coroutines/channels/Channel;", "", "_film", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlin/Pair;", "", "_isLoading", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "_ready", "activeJob", "Lkotlinx/coroutines/Job;", "actorFilms", "getActorFilms", "()I", "setActorFilms", "(I)V", "actorId", "getActorId", "setActorId", "countries", "", "Lcom/example/kinopoiskup/entity/Countries;", "getCountries", "()Ljava/util/List;", "setCountries", "(Ljava/util/List;)V", "countrySelected", "getCountrySelected", "()Ljava/lang/Integer;", "setCountrySelected", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "countrySelectedString", "getCountrySelectedString", "()Ljava/lang/String;", "setCountrySelectedString", "(Ljava/lang/String;)V", "delayJob", "error", "Lkotlinx/coroutines/flow/Flow;", "getError", "()Lkotlinx/coroutines/flow/Flow;", "film", "Lkotlinx/coroutines/flow/SharedFlow;", "getFilm", "()Lkotlinx/coroutines/flow/SharedFlow;", "filmInfo", "Lcom/example/kinopoiskup/entity/FilmInfoDTO;", "getFilmInfo", "()Lcom/example/kinopoiskup/entity/FilmInfoDTO;", "setFilmInfo", "(Lcom/example/kinopoiskup/entity/FilmInfoDTO;)V", "filmType", "", "getFilmType", "()[Ljava/lang/String;", "setFilmType", "([Ljava/lang/String;)V", "[Ljava/lang/String;", "genreSelected", "getGenreSelected", "setGenreSelected", "genreSelectedString", "getGenreSelectedString", "setGenreSelectedString", "genres", "Lcom/example/kinopoiskup/entity/Genres;", "getGenres", "setGenres", "hideSeenFilms", "getHideSeenFilms", "()Z", "setHideSeenFilms", "(Z)V", "isForward", "setForward", "isLoading", "Lkotlinx/coroutines/flow/StateFlow;", "()Lkotlinx/coroutines/flow/StateFlow;", "isNetworkErrorShow", "setNetworkErrorShow", "isStaffForward", "setStaffForward", "listPremieres", "", "Lcom/example/kinopoiskup/entity/MoviesFilms;", "getListPremieres", "setListPremieres", "listRecycler", "Lcom/example/kinopoiskup/entity/RecyclerItem;", "listRecyclerFull", "getListRecyclerFull", "setListRecyclerFull", "listRecyclerStaff", "listSearch", "movieId", "getMovieId", "setMovieId", "moviePosition", "getMoviePosition", "setMoviePosition", "orderSelector", "getOrderSelector", "setOrderSelector", "picCount", "getPicCount", "setPicCount", "picMap", "", "getPicMap", "()Ljava/util/Map;", "setPicMap", "(Ljava/util/Map;)V", "picQueries", "picResults", "Lcom/example/kinopoiskup/entity/ImageItems;", "getPicResults", "setPicResults", "preferences", "Landroidx/lifecycle/LiveData;", "Lcom/example/kinopoiskup/data/UserPreferences;", "getPreferences", "()Landroidx/lifecycle/LiveData;", "profileRecycler", "rangeFrom", "getRangeFrom", "setRangeFrom", "rangeTo", "getRangeTo", "setRangeTo", "ready", "getReady", "showFilmInfo", "Landroidx/lifecycle/MutableLiveData;", "getShowFilmInfo", "()Landroidx/lifecycle/MutableLiveData;", "setShowFilmInfo", "(Landroidx/lifecycle/MutableLiveData;)V", "showGallery", "getShowGallery", "setShowGallery", "showGalleryFull", "getShowGalleryFull", "setShowGalleryFull", "showGalleryStaff", "getShowGalleryStaff", "setShowGalleryStaff", "showProfile", "getShowProfile", "setShowProfile", "showSearchResults", "getShowSearchResults", "setShowSearchResults", "showSerial", "Lcom/example/kinopoiskup/entity/SeasonItems;", "getShowSerial", "setShowSerial", "similarFilmsList", "getSimilarFilmsList", "setSimilarFilmsList", "sortOrder", "getSortOrder", "setSortOrder", "staffFilmsList", "Lcom/example/kinopoiskup/entity/StaffFilms;", "getStaffFilmsList", "setStaffFilmsList", "staffInfo", "Lcom/example/kinopoiskup/entity/StaffDTO;", "staffInfoFilms", "getStaffInfoFilms", "setStaffInfoFilms", "staffInfoFilmsLocal", "getStaffInfoFilmsLocal", "setStaffInfoFilmsLocal", "staffInfoShow", "getStaffInfoShow", "setStaffInfoShow", "table", "getTable", "setTable", "typeSelector", "getTypeSelector", "setTypeSelector", "userPreferencesFlow", "yearFirst", "getYearFirst", "setYearFirst", "yearLast", "getYearLast", "setYearLast", "years", "getYears", "addCollection", "", "value", "Lcom/example/kinopoiskup/entity/CollectionEntity;", "addMovieDatabase", "Lcom/example/kinopoiskup/entity/FilmEntity;", "addNewCollection", "item", "cancelDelay", "deleteCollection", "index", "deleteFilmsByCategory", "loadFilmById", "loadGenres", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadKinopoisk", "loadKinopoiskDetails", "id", "serial", "loadProfileCollection", "collection", "loadProfileData", "loadStaffInfoById", "pagedCollectionFlow", "Landroidx/paging/PagingData;", "pagedNetworkFlow", "request", "Lcom/example/kinopoiskup/entity/QueryItem;", "pagedNetworkFlowGallery", "pagedStaffFlow", "Lcom/example/kinopoiskup/entity/StaffEntity;", "query", "readUserPreferences", "refreshItemsList", "first", "last", "tab", "refreshListSynch", "list", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "runDelay", "saveIntPreference", "mode", "saveShowCompleted", "show", "saveStringPreference", "setupCollection", "tryToRefreshItemsList", "updateCollection", "name", "updateCollectionCount", "updateFilmBitmask", "bitmask", "", "firstCap", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.kinopoiskup.data.DataStoreManager dataStore = null;
    private final com.example.kinopoiskup.entity.CollectionDao dao = null;
    private final com.example.kinopoiskup.data.MainRepository repository = null;
    private final kotlinx.coroutines.channels.Channel<java.lang.String> _error = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<java.lang.String> error = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _isLoading = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isLoading = null;
    private final kotlinx.coroutines.channels.Channel<java.lang.Boolean> _ready = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<java.lang.Boolean> ready = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<java.lang.Integer> table;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String yearFirst;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String yearLast;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer rangeFrom;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer rangeTo;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer countrySelected;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer genreSelected;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String countrySelectedString;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String genreSelectedString;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String[] sortOrder = {"RATING", "YEAR", "NUM_VOTE"};
    @org.jetbrains.annotations.NotNull()
    private java.lang.String[] filmType = {"ALL", "FILM", "TV_SERIES"};
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer orderSelector;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer typeSelector;
    private boolean hideSeenFilms = false;
    @org.jetbrains.annotations.NotNull()
    private java.util.Map<java.lang.String, java.lang.Integer> picMap;
    private final java.util.List<java.lang.String> picQueries = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<java.util.List<com.example.kinopoiskup.entity.ImageItems>> picResults;
    private int picCount = 0;
    private boolean isNetworkErrorShow = true;
    private boolean isForward = true;
    private boolean isStaffForward = true;
    private int movieId = -1;
    private int moviePosition = -1;
    private int actorId = -1;
    private int actorFilms = 0;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.example.kinopoiskup.entity.SeasonItems> showSerial;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.example.kinopoiskup.entity.StaffFilms> staffFilmsList;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.example.kinopoiskup.entity.MoviesFilms> similarFilmsList;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<com.example.kinopoiskup.entity.RecyclerItem>> showGalleryStaff;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<com.example.kinopoiskup.entity.RecyclerItem>> showGallery;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<com.example.kinopoiskup.entity.RecyclerItem>> showGalleryFull;
    private java.util.List<com.example.kinopoiskup.entity.RecyclerItem> listRecyclerStaff;
    private java.util.List<com.example.kinopoiskup.entity.RecyclerItem> listRecycler;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.example.kinopoiskup.entity.RecyclerItem> listRecyclerFull;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<com.example.kinopoiskup.entity.RecyclerItem>> showProfile;
    private java.util.List<com.example.kinopoiskup.entity.RecyclerItem> profileRecycler;
    @org.jetbrains.annotations.NotNull()
    private com.example.kinopoiskup.entity.FilmInfoDTO filmInfo;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.example.kinopoiskup.entity.FilmInfoDTO> showFilmInfo;
    private com.example.kinopoiskup.entity.StaffDTO staffInfo;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.example.kinopoiskup.entity.MoviesFilms> staffInfoFilms;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.example.kinopoiskup.entity.MoviesFilms> staffInfoFilmsLocal;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.example.kinopoiskup.entity.StaffDTO> staffInfoShow;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<com.example.kinopoiskup.entity.MoviesFilms>> showSearchResults;
    private java.util.List<com.example.kinopoiskup.entity.MoviesFilms> listSearch;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.example.kinopoiskup.entity.MoviesFilms> listPremieres;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.example.kinopoiskup.entity.Genres> genres;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.example.kinopoiskup.entity.Countries> countries;
    private kotlinx.coroutines.Job delayJob;
    private kotlinx.coroutines.Job activeJob;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> years = null;
    private final kotlinx.coroutines.flow.Flow<com.example.kinopoiskup.data.UserPreferences> userPreferencesFlow = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.kinopoiskup.data.UserPreferences> preferences = null;
    private final kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Pair<java.lang.Integer, java.lang.Integer>> _film = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.SharedFlow<kotlin.Pair<java.lang.Integer, java.lang.Integer>> film = null;
    
    @javax.inject.Inject()
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.example.kinopoiskup.data.DataStoreManager dataStore, @org.jetbrains.annotations.NotNull()
    com.example.kinopoiskup.entity.CollectionDao dao, @org.jetbrains.annotations.NotNull()
    com.example.kinopoiskup.data.MainRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.lang.String> getError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.lang.Boolean> getReady() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Integer> getTable() {
        return null;
    }
    
    public final void setTable(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getYearFirst() {
        return null;
    }
    
    public final void setYearFirst(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getYearLast() {
        return null;
    }
    
    public final void setYearLast(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getRangeFrom() {
        return null;
    }
    
    public final void setRangeFrom(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getRangeTo() {
        return null;
    }
    
    public final void setRangeTo(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getCountrySelected() {
        return null;
    }
    
    public final void setCountrySelected(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getGenreSelected() {
        return null;
    }
    
    public final void setGenreSelected(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCountrySelectedString() {
        return null;
    }
    
    public final void setCountrySelectedString(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getGenreSelectedString() {
        return null;
    }
    
    public final void setGenreSelectedString(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String[] getSortOrder() {
        return null;
    }
    
    public final void setSortOrder(@org.jetbrains.annotations.NotNull()
    java.lang.String[] p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String[] getFilmType() {
        return null;
    }
    
    public final void setFilmType(@org.jetbrains.annotations.NotNull()
    java.lang.String[] p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getOrderSelector() {
        return null;
    }
    
    public final void setOrderSelector(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getTypeSelector() {
        return null;
    }
    
    public final void setTypeSelector(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    public final boolean getHideSeenFilms() {
        return false;
    }
    
    public final void setHideSeenFilms(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, java.lang.Integer> getPicMap() {
        return null;
    }
    
    public final void setPicMap(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.util.List<com.example.kinopoiskup.entity.ImageItems>> getPicResults() {
        return null;
    }
    
    public final void setPicResults(@org.jetbrains.annotations.NotNull()
    java.util.List<java.util.List<com.example.kinopoiskup.entity.ImageItems>> p0) {
    }
    
    public final int getPicCount() {
        return 0;
    }
    
    public final void setPicCount(int p0) {
    }
    
    public final boolean isNetworkErrorShow() {
        return false;
    }
    
    public final void setNetworkErrorShow(boolean p0) {
    }
    
    public final boolean isForward() {
        return false;
    }
    
    public final void setForward(boolean p0) {
    }
    
    public final boolean isStaffForward() {
        return false;
    }
    
    public final void setStaffForward(boolean p0) {
    }
    
    public final int getMovieId() {
        return 0;
    }
    
    public final void setMovieId(int p0) {
    }
    
    public final int getMoviePosition() {
        return 0;
    }
    
    public final void setMoviePosition(int p0) {
    }
    
    public final int getActorId() {
        return 0;
    }
    
    public final void setActorId(int p0) {
    }
    
    public final int getActorFilms() {
        return 0;
    }
    
    public final void setActorFilms(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.kinopoiskup.entity.SeasonItems> getShowSerial() {
        return null;
    }
    
    public final void setShowSerial(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.kinopoiskup.entity.SeasonItems> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.kinopoiskup.entity.StaffFilms> getStaffFilmsList() {
        return null;
    }
    
    public final void setStaffFilmsList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.kinopoiskup.entity.StaffFilms> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.kinopoiskup.entity.MoviesFilms> getSimilarFilmsList() {
        return null;
    }
    
    public final void setSimilarFilmsList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.kinopoiskup.entity.MoviesFilms> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.example.kinopoiskup.entity.RecyclerItem>> getShowGalleryStaff() {
        return null;
    }
    
    public final void setShowGalleryStaff(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<com.example.kinopoiskup.entity.RecyclerItem>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.example.kinopoiskup.entity.RecyclerItem>> getShowGallery() {
        return null;
    }
    
    public final void setShowGallery(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<com.example.kinopoiskup.entity.RecyclerItem>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.example.kinopoiskup.entity.RecyclerItem>> getShowGalleryFull() {
        return null;
    }
    
    public final void setShowGalleryFull(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<com.example.kinopoiskup.entity.RecyclerItem>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.kinopoiskup.entity.RecyclerItem> getListRecyclerFull() {
        return null;
    }
    
    public final void setListRecyclerFull(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.kinopoiskup.entity.RecyclerItem> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.example.kinopoiskup.entity.RecyclerItem>> getShowProfile() {
        return null;
    }
    
    public final void setShowProfile(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<com.example.kinopoiskup.entity.RecyclerItem>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.kinopoiskup.entity.FilmInfoDTO getFilmInfo() {
        return null;
    }
    
    public final void setFilmInfo(@org.jetbrains.annotations.NotNull()
    com.example.kinopoiskup.entity.FilmInfoDTO p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.kinopoiskup.entity.FilmInfoDTO> getShowFilmInfo() {
        return null;
    }
    
    public final void setShowFilmInfo(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.example.kinopoiskup.entity.FilmInfoDTO> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.kinopoiskup.entity.MoviesFilms> getStaffInfoFilms() {
        return null;
    }
    
    public final void setStaffInfoFilms(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.kinopoiskup.entity.MoviesFilms> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.kinopoiskup.entity.MoviesFilms> getStaffInfoFilmsLocal() {
        return null;
    }
    
    public final void setStaffInfoFilmsLocal(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.kinopoiskup.entity.MoviesFilms> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.kinopoiskup.entity.StaffDTO> getStaffInfoShow() {
        return null;
    }
    
    public final void setStaffInfoShow(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.example.kinopoiskup.entity.StaffDTO> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.example.kinopoiskup.entity.MoviesFilms>> getShowSearchResults() {
        return null;
    }
    
    public final void setShowSearchResults(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<com.example.kinopoiskup.entity.MoviesFilms>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.kinopoiskup.entity.MoviesFilms> getListPremieres() {
        return null;
    }
    
    public final void setListPremieres(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.kinopoiskup.entity.MoviesFilms> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.kinopoiskup.entity.Genres> getGenres() {
        return null;
    }
    
    public final void setGenres(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.kinopoiskup.entity.Genres> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.kinopoiskup.entity.Countries> getCountries() {
        return null;
    }
    
    public final void setCountries(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.kinopoiskup.entity.Countries> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getYears() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.kinopoiskup.data.UserPreferences> getPreferences() {
        return null;
    }
    
    public final void saveShowCompleted(boolean show) {
    }
    
    public final void saveIntPreference(int value, int mode) {
    }
    
    public final void saveStringPreference(@org.jetbrains.annotations.NotNull()
    java.lang.String value, int mode) {
    }
    
    public final void readUserPreferences() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.example.kinopoiskup.entity.MoviesFilms>> pagedNetworkFlow(@org.jetbrains.annotations.NotNull()
    com.example.kinopoiskup.entity.QueryItem request) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.example.kinopoiskup.entity.ImageItems>> pagedNetworkFlowGallery(@org.jetbrains.annotations.NotNull()
    com.example.kinopoiskup.entity.QueryItem request) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.example.kinopoiskup.entity.StaffEntity>> pagedStaffFlow(int query) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.example.kinopoiskup.entity.CollectionEntity>> pagedCollectionFlow() {
        return null;
    }
    
    public final void addMovieDatabase(@org.jetbrains.annotations.NotNull()
    com.example.kinopoiskup.entity.FilmEntity film) {
    }
    
    public final void updateFilmBitmask(int id, long bitmask) {
    }
    
    public final void deleteFilmsByCategory() {
    }
    
    public final void loadProfileData() {
    }
    
    public final void loadProfileCollection(int collection) {
    }
    
    public final void addCollection(@org.jetbrains.annotations.NotNull()
    com.example.kinopoiskup.entity.CollectionEntity value) {
    }
    
    public final void setupCollection() {
    }
    
    public final void deleteCollection(int index) {
    }
    
    public final void addNewCollection(@org.jetbrains.annotations.NotNull()
    com.example.kinopoiskup.entity.CollectionEntity item) {
    }
    
    public final void updateCollection(@org.jetbrains.annotations.NotNull()
    java.lang.String name, int value) {
    }
    
    public final void updateCollectionCount(@org.jetbrains.annotations.NotNull()
    java.lang.String name, int value) {
    }
    
    public final void tryToRefreshItemsList(int first, int last, int tab) {
    }
    
    public final void cancelDelay() {
    }
    
    public final void runDelay() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object refreshListSynch(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.kinopoiskup.entity.MoviesFilms> list, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object loadGenres(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String firstCap(@org.jetbrains.annotations.NotNull()
    java.lang.String $this$firstCap) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object loadKinopoisk(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    public final void loadFilmById() {
    }
    
    public final void loadStaffInfoById() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.SharedFlow<kotlin.Pair<java.lang.Integer, java.lang.Integer>> getFilm() {
        return null;
    }
    
    public final void refreshItemsList(int first, int last, int tab) {
    }
    
    public final void loadKinopoiskDetails(int id, boolean serial) {
    }
}