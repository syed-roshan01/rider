.class public final Ld5/c1;
.super Ld9/j;

# interfaces
.implements Lc9/a;


# static fields
.field private static final short:[S


# instance fields
.field public final a:I

.field public final b:Lb/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x7

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ld5/c1;->short:[S

    return-void

    nop

    :array_0
    .array-data 2
        0x76cs
        0x768s
        0x764s
        0x762s
        0x760s
        0x72as
        0x72fs
    .end array-data
.end method

.method public synthetic constructor <init>(Lb/l;I)V
    .locals 2

    iput p2, p0, Ld5/c1;->a:I

    iput-object p1, p0, Ld5/c1;->b:Lb/l;

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ld9/j;-><init>(I)V

    invoke-static {}, Lm9/۟ۤۢۦ۠;->ۦۦۢ۟()I

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
    const-string v0, "2oSh1vnj"

    invoke-static {v0}, Lja/ۥۣۨ۠;->ۦۢۨۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->decode(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_3
    return-void

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۣ۟۠ۡ()[S
    .locals 2

    invoke-static {}, Le1/ۦۣۢۥ;->ۣۨۥۨ()I

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
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    sget-object v0, Ld5/c1;->short:[S

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
.method public final invoke()Ljava/lang/Object;
    .locals 6

    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v0

    invoke-static {p0}, Lcom/google/firebase/firestore/model/۟ۧۦۨۢ;->ۦۥۥ۠(Ljava/lang/Object;)Lb/l;

    move-result-object v1

    invoke-static {}, Ld5/c1;->ۣ۟۠ۡ()[S

    move-result-object v2

    const/4 v3, 0x0

    sget v4, Lcom/google/android/gms/measurement/internal/۟۟ۨ۠ۢ;->۠ۧ۠ۤ:I

    xor-int/lit16 v4, v4, 0x314

    const/16 v5, 0x705

    invoke-static {v2, v3, v4, v5}, Lj2/۠ۤۨۤ;->۟۟ۥۥ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {p0}, Ldagger/hilt/codegen/۟۟ۡ۠ۥ;->۟ۧ۟۟(Ljava/lang/Object;)I

    move-result v3

    packed-switch v3, :pswitch_data_0

    packed-switch v3, :pswitch_data_1

    invoke-static {v1, v2}, Ls7/۟ۢ۟ۤۧ;->۠۟ۤۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v1, 0x650

    :goto_0
    xor-int/lit16 v1, v1, 0x661

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :goto_1
    :sswitch_0
    return-object v0

    :sswitch_1
    const/16 v1, 0x66f

    goto :goto_0

    :pswitch_0
    invoke-static {v1, v2}, Ls7/۟ۢ۟ۤۧ;->۠۟ۤۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_1
    packed-switch v3, :pswitch_data_2

    invoke-static {v1, v2}, Ls7/۟ۢ۟ۤۧ;->۠۟ۤۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v1, 0x6cc

    :goto_2
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_2

    :sswitch_2
    const/16 v1, 0x6eb

    goto :goto_2

    :pswitch_2
    invoke-static {v1, v2}, Ls7/۟ۢ۟ۤۧ;->۠۟ۤۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
    .end sparse-switch

    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_2
    .end packed-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_2
        0x36 -> :sswitch_0
    .end sparse-switch
.end method
