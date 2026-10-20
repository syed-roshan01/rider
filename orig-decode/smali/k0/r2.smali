.class public abstract Lk0/r2;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lm0/m3;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lm0/m3;

    invoke-static {}, Ln8/ۢۡۨۨ;->ۣۢ۠ۧ()Lk0/j0;

    move-result-object v1

    invoke-direct {v0, v1}, Lm0/m3;-><init>(Lc9/a;)V

    sput-object v0, Lk0/r2;->a:Lm0/m3;

    return-void
.end method

.method public static final a(ILm0/m;)Le1/l0;
    .locals 5

    const/4 v4, 0x0

    check-cast p1, Lm0/q;

    invoke-static {}, Lcom/google/firebase/installations/۠ۤۢ۟;->۟ۤۢۧۡ()Lm0/m3;

    move-result-object v0

    invoke-static {p1, v0}, Ly/ۤۨۧ۟;->ۣ۟ۨۧۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk0/q2;

    const/16 v1, 0x650

    :goto_0
    xor-int/lit16 v1, v1, 0x661

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v1, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz p0, :cond_0

    const/16 v1, 0x6ad

    goto :goto_0

    :sswitch_2
    sget v1, Lcom/google/firebase/remoteconfig/interop/ۨۨۢ۠;->۟۟ۢ۠۠:I

    xor-int/lit16 v1, v1, -0x12c

    add-int/2addr v1, p0

    packed-switch v1, :pswitch_data_0

    new-instance v0, Landroidx/fragment/app/a0;

    invoke-direct {v0}, Landroidx/fragment/app/a0;-><init>()V

    throw v0

    :pswitch_0
    invoke-static {v0}, Lz7/۟۟ۨۢۢ;->ۢۤۡ۠(Ljava/lang/Object;)Le0/a;

    move-result-object v0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/16 v1, 0x6eb

    goto :goto_1

    :pswitch_1
    invoke-static {}, Landroidx/core/content/ۣۣۣ۟;->ۣۣ۟ۤ()Le1/f0;

    move-result-object v0

    const/16 v1, 0x748

    :goto_2
    xor-int/lit16 v1, v1, 0x759

    sparse-switch v1, :sswitch_data_2

    goto :goto_2

    :sswitch_4
    const v1, 0xbe22

    goto :goto_2

    :pswitch_2
    invoke-static {v0}, Ls/ۧۥ۟۟;->ۣۡ۠ۤ(Ljava/lang/Object;)Le0/a;

    move-result-object v0

    const v1, 0xbe7f

    :goto_3
    const v2, 0xbe90

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_3

    goto :goto_3

    :goto_4
    :sswitch_5
    return-object v0

    :sswitch_6
    const v1, 0xbe9e

    goto :goto_3

    :pswitch_3
    invoke-static {v0}, Lc1/ۣ۟۠ۧۤ;->۟ۥۥ۠۠(Ljava/lang/Object;)Le0/a;

    move-result-object v0

    invoke-static {v0}, Lcom/google/gson/internal/bind/ۥۣۨۡ;->۟ۧۤ۠ۥ(Ljava/lang/Object;)Le0/e;

    move-result-object v0

    const v1, 0xbefb

    :goto_5
    const v2, 0xbf0c

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_4

    goto :goto_5

    :sswitch_7
    const v1, 0xbf1a

    goto :goto_5

    :pswitch_4
    invoke-static {v0}, Lc1/ۣ۟۠ۧۤ;->۟ۥۥ۠۠(Ljava/lang/Object;)Le0/a;

    move-result-object v0

    const-wide/16 v2, 0x0

    double-to-float v1, v2

    new-instance v2, Le0/c;

    invoke-direct {v2, v1}, Le0/c;-><init>(F)V

    new-instance v3, Le0/c;

    invoke-direct {v3, v1}, Le0/c;-><init>(F)V

    sget v1, Lz7/۠ۡ۟ۦ;->۟ۧۤۡۧ:I

    xor-int/lit16 v1, v1, 0x330

    invoke-static {v0, v2, v4, v3, v1}, Landroidx/versionedparcelable/۟ۦۦ۟ۧ;->۟ۥ۠ۤ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)Le0/e;

    move-result-object v0

    const v1, 0xc202

    :goto_6
    const v2, 0xc213

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_5

    goto :goto_6

    :sswitch_8
    const v1, 0xc221

    goto :goto_6

    :pswitch_5
    invoke-static {v0}, Lc1/ۣ۟۠ۧۤ;->۟ۥۥ۠۠(Ljava/lang/Object;)Le0/a;

    move-result-object v0

    const v1, 0xc27e

    :goto_7
    const v2, 0xc28f

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_6

    goto :goto_7

    :sswitch_9
    const v1, 0xc29d

    goto :goto_7

    :pswitch_6
    invoke-static {}, Lm4/۟ۧۤ۠;->ۨۦۡۦ()Le0/e;

    move-result-object v0

    const v1, 0xc2fa

    :goto_8
    const v2, 0xc30b

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_7

    goto :goto_8

    :sswitch_a
    const v1, 0xc5a4

    goto :goto_8

    :pswitch_7
    invoke-static {v0}, Lh1/۟۟ۨۦۦ;->ۦۡۥۨ(Ljava/lang/Object;)Le0/a;

    move-result-object v0

    invoke-static {v0}, Lcom/google/gson/internal/bind/ۥۣۨۡ;->۟ۧۤ۠ۥ(Ljava/lang/Object;)Le0/e;

    move-result-object v0

    const v1, 0xc601

    :goto_9
    const v2, 0xc612

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_8

    goto :goto_9

    :sswitch_b
    const v1, 0xc620

    goto :goto_9

    :pswitch_8
    invoke-static {v0}, Lh1/۟۟ۨۦۦ;->ۦۡۥۨ(Ljava/lang/Object;)Le0/a;

    move-result-object v0

    const v1, 0xc67d

    :goto_a
    const v2, 0xc68e

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_9

    goto :goto_a

    :sswitch_c
    const v1, 0xc69c

    goto :goto_a

    :pswitch_9
    invoke-static {v0}, Ll3/ۥۣۤ۟;->ۣ۟ۥۣۡ(Ljava/lang/Object;)Le0/a;

    move-result-object v0

    invoke-static {v0}, Lcom/google/gson/internal/bind/ۥۣۨۡ;->۟ۧۤ۠ۥ(Ljava/lang/Object;)Le0/e;

    move-result-object v0

    const v1, 0xc984

    :goto_b
    const v2, 0xc995

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_a

    goto :goto_b

    :sswitch_d
    const v1, 0xc9a3

    goto :goto_b

    :pswitch_a
    invoke-static {v0}, Ll3/ۥۣۤ۟;->ۣ۟ۥۣۡ(Ljava/lang/Object;)Le0/a;

    move-result-object v0

    goto/16 :goto_4

    :sswitch_e
    throw v4

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_e
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_4
        0xb97b -> :sswitch_5
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_5
        0xef -> :sswitch_6
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_5
        0x1f7 -> :sswitch_7
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_8
        0x32 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_5
        0xf1 -> :sswitch_9
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_a
        0x6af -> :sswitch_5
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_b
        0x32 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_5
        0xf3 -> :sswitch_c
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x11 -> :sswitch_d
        0x36 -> :sswitch_5
    .end sparse-switch
.end method

.method public static final b(Le0/a;)Le0/e;
    .locals 10

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v8, 0x0

    const-string v4, "\u06e5\u06e6\u06e4"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move v5, v6

    move v7, v6

    :goto_0
    invoke-static {v4}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v4

    sparse-switch v4, :sswitch_data_0

    new-instance v3, Le0/c;

    invoke-direct {v3, v8}, Le0/c;-><init>(F)V

    const-string v4, "\u06e1\u06e4\u06e8"

    goto :goto_0

    :sswitch_0
    xor-int/lit16 v5, v7, 0x242

    const-string v4, "\u06e0\u06e5\u06e1"

    goto :goto_0

    :sswitch_1
    invoke-static {p0, v1, v3, v2, v5}, Landroidx/versionedparcelable/۟ۦۦ۟ۧ;->۟ۥ۠ۤ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)Le0/e;

    move-result-object v0

    const-string v4, "\u06df\u06e5\u06e2"

    goto :goto_0

    :sswitch_2
    const-wide/16 v8, 0x0

    double-to-float v6, v8

    const-string v4, "\u06df\u06e6\u06e8"

    move v8, v6

    goto :goto_0

    :sswitch_3
    new-instance v2, Le0/c;

    invoke-direct {v2, v8}, Le0/c;-><init>(F)V

    const-string v4, "\u06e4\u06e2\u06e7"

    goto :goto_0

    :sswitch_4
    sget v6, Lr/۠ۡ۠;->۟ۢۨۦ:I

    const-string v4, "\u06e3\u06e4\u06df"

    move v7, v6

    goto :goto_0

    :sswitch_5
    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aa7bc -> :sswitch_5
        0x1aa7e1 -> :sswitch_3
        0x1aab7c -> :sswitch_1
        0x1aaf25 -> :sswitch_4
        0x1ab69e -> :sswitch_0
        0x1abe63 -> :sswitch_2
    .end sparse-switch
.end method
