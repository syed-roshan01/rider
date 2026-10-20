.class public final Lf5/a;
.super Lf5/h;


# static fields
.field private static final short:[S


# instance fields
.field public final a:Lcom/auto/accept/data/model/UserProfile;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x11

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lf5/a;->short:[S

    return-void

    :array_0
    .array-data 2
        0x280s
        0x2aes
        0x2ads
        0x2a1s
        0x2a9s
        0x2a7s
        0x2a6s
        0x2eas
        0x2b2s
        0x2b0s
        0x2ads
        0x2a4s
        0x2abs
        0x2aes
        0x2a7s
        0x2ffs
        0x8b5s
    .end array-data
.end method

.method public constructor <init>(Lcom/auto/accept/data/model/UserProfile;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf5/a;->a:Lcom/auto/accept/data/model/UserProfile;

    invoke-static {}, Ld9/ۨۧۧۦ;->ۨۦ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "o9ea87Z0HObyIj"

    invoke-static {v0}, Lq0/۟ۧۤۧ;->ۦۨۧۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :sswitch_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟ۤۨ۠ۥ()[S
    .locals 2

    invoke-static {}, Lcom/google/firebase/firestore/remote/۟۟ۢۥۤ;->ۨۨۡ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    sget-object v0, Lf5/a;->short:[S

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/16 v2, 0x650

    :goto_0
    xor-int/lit16 v2, v2, 0x661

    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v2, 0x68e

    goto :goto_0

    :sswitch_1
    if-ne p0, p1, :cond_0

    const/16 v2, 0x6ad

    goto :goto_0

    :sswitch_2
    instance-of v3, p1, Lf5/a;

    const/16 v2, 0x6cc

    :goto_1
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-nez v3, :cond_1

    const/16 v2, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v2, 0x70a

    goto :goto_1

    :sswitch_5
    move v0, v1

    :goto_2
    :sswitch_6
    return v0

    :sswitch_7
    check-cast p1, Lf5/a;

    invoke-static {p0}, Lm4/۟ۧۤ۠;->۟ۦۦۥۥ(Ljava/lang/Object;)Lcom/auto/accept/data/model/UserProfile;

    move-result-object v2

    invoke-static {p1}, Lm4/۟ۧۤ۠;->۟ۦۦۥۥ(Ljava/lang/Object;)Lcom/auto/accept/data/model/UserProfile;

    move-result-object v3

    invoke-static {v2, v3}, Ldagger/hilt/android/components/۟ۦۦۢۤ;->۟ۦۥۣ۟(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const/16 v2, 0x748

    :goto_3
    xor-int/lit16 v2, v2, 0x759

    sparse-switch v2, :sswitch_data_2

    goto :goto_3

    :sswitch_8
    if-nez v3, :cond_2

    const v2, 0xbe60

    goto :goto_3

    :cond_2
    :sswitch_9
    const v2, 0xbe41

    goto :goto_3

    :sswitch_a
    move v0, v1

    goto :goto_2

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_6
        0xef -> :sswitch_2
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_8
        0xb918 -> :sswitch_6
        0xb939 -> :sswitch_a
        0xb97b -> :sswitch_9
    .end sparse-switch
.end method

.method public final hashCode()I
    .locals 1

    invoke-static {p0}, Lm4/۟ۧۤ۠;->۟ۦۦۥۥ(Ljava/lang/Object;)Lcom/auto/accept/data/model/UserProfile;

    move-result-object v0

    invoke-static {v0}, Li/ۢۥۣ۟;->ۣ۟۟ۤۦ(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 9

    const/4 v7, 0x0

    const/4 v1, 0x0

    const-string v5, "\u06e4\u06e0\u06e0"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move v6, v7

    move v8, v7

    :goto_0
    invoke-static {v5}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    xor-int/lit16 v8, v6, 0x144

    const-string v1, "\u06df\u06e7"

    move-object v5, v1

    goto :goto_0

    :sswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v1, "\u06e4\u06e8\u06e8"

    move-object v5, v1

    goto :goto_0

    :sswitch_1
    invoke-static {v0, v2}, Ld1/ۣۣ۟ۢۨ;->۟ۤۤۧۥ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "\u06e8\u06e1\u06e5"

    move-object v5, v1

    goto :goto_0

    :sswitch_2
    invoke-static {v0}, Lv0/ۣ۟۟ۤۧ;->ۨۥۣۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v5, "\u06df\u06e4\u06e4"

    move-object v4, v1

    goto :goto_0

    :sswitch_3
    invoke-static {}, Lf5/a;->۟ۤۨ۠ۥ()[S

    move-result-object v1

    const-string v5, "\u06e1\u06e0\u06e5"

    move-object v3, v1

    goto :goto_0

    :sswitch_4
    const/16 v1, 0x2c2

    invoke-static {v3, v7, v8, v1}, Lo5/۟ۧۡۧۦ;->۟ۤ۟ۢۢ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v5, "\u06e2\u06e0\u06e8"

    move-object v4, v1

    goto :goto_0

    :sswitch_5
    const/16 v1, 0x10

    const/4 v4, 0x1

    const/16 v5, 0x89c

    invoke-static {v3, v1, v4, v5}, Ls3/۟ۧ۟ۡۢ;->ۦۤۢ۠([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v5, "\u06e0\u06e0\u06e6"

    move-object v4, v1

    goto :goto_0

    :sswitch_6
    invoke-static {v0, v4}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "\u06e0\u06e7\u06e0"

    move-object v5, v1

    goto :goto_0

    :sswitch_7
    invoke-static {}, Lf5/a;->۟ۤۨ۠ۥ()[S

    move-result-object v1

    const-string v5, "\u06e7\u06e8\u06e6"

    move-object v3, v1

    goto :goto_0

    :sswitch_8
    invoke-static {p0}, Lm4/۟ۧۤ۠;->۟ۦۦۥۥ(Ljava/lang/Object;)Lcom/auto/accept/data/model/UserProfile;

    move-result-object v1

    const-string v5, "\u06e8\u06e2\u06e2"

    move-object v2, v1

    goto :goto_0

    :sswitch_9
    sget v6, Lx0/ۣ۠۟۠;->۟۠ۨ۠ۢ:I

    const-string v1, "\u06df\u06e5\u06e0"

    move-object v5, v1

    goto :goto_0

    :sswitch_a
    return-object v4

    :sswitch_data_0
    .sparse-switch
        0xdbe8 -> :sswitch_4
        0x1aa79f -> :sswitch_a
        0x1aaae6 -> :sswitch_6
        0x1aabb9 -> :sswitch_2
        0x1aaea6 -> :sswitch_5
        0x1ab26a -> :sswitch_0
        0x1ab9e4 -> :sswitch_7
        0x1abae4 -> :sswitch_8
        0x1ac625 -> :sswitch_9
        0x1ac90c -> :sswitch_3
        0x1ac928 -> :sswitch_1
    .end sparse-switch
.end method
