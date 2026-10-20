.class public final Lk6/w5;
.super Ljava/lang/Object;


# static fields
.field private static final short:[S


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/Boolean;

.field public final f:J

.field public final g:Lcom/google/android/gms/internal/measurement/zzdd;

.field public final h:Z

.field public final i:Ljava/lang/Long;

.field public final j:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x1c

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lk6/w5;->short:[S

    return-void

    :array_0
    .array-data 2
        0x23fs
        0x23as
        0x22fs
        0x23as
        0x218s
        0x234s
        0x237s
        0x237s
        0x23es
        0x238s
        0x22fs
        0x232s
        0x234s
        0x235s
        0x21fs
        0x23es
        0x23ds
        0x23as
        0x22es
        0x237s
        0x22fs
        0x21es
        0x235s
        0x23as
        0x239s
        0x237s
        0x23es
        0x23fs
    .end array-data
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/measurement/zzdd;Ljava/lang/Long;)V
    .locals 6

    const/4 v5, 0x1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean v5, p0, Lk6/w5;->h:Z

    invoke-static {p1}, Lf/۟ۤۧ۠ۡ;->ۥۧۥۡ(Ljava/lang/Object;)V

    invoke-static {p1}, Landroidx/compose/foundation/layout/ۧۦۧۦ;->ۣ۟ۡۨۡ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lf/۟ۤۧ۠ۡ;->ۥۧۥۡ(Ljava/lang/Object;)V

    iput-object v0, p0, Lk6/w5;->a:Landroid/content/Context;

    iput-object p3, p0, Lk6/w5;->i:Ljava/lang/Long;

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
    if-eqz p2, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    iput-object p2, p0, Lk6/w5;->g:Lcom/google/android/gms/internal/measurement/zzdd;

    invoke-static {p2}, Lo4/۟۟ۡۧۤ;->ۦۧۢ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lk6/w5;->b:Ljava/lang/String;

    invoke-static {p2}, Lr6/ۥۡۥۥ;->ۧۡۧ۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lk6/w5;->c:Ljava/lang/String;

    invoke-static {p2}, Le2/ۨۥۦۡ;->۟ۦ۟ۤۧ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lk6/w5;->d:Ljava/lang/String;

    invoke-static {p2}, Lx4/۟ۤۦۥ۟;->ۨ۠ۨ(Ljava/lang/Object;)Z

    move-result v0

    iput-boolean v0, p0, Lk6/w5;->h:Z

    invoke-static {p2}, Ls0/ۧۧۨۥ;->ۥۦ۠(Ljava/lang/Object;)J

    move-result-wide v0

    iput-wide v0, p0, Lk6/w5;->f:J

    invoke-static {p2}, Lo8/۟ۢۧۢۤ;->ۣۢۡۧ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lk6/w5;->j:Ljava/lang/String;

    invoke-static {p2}, Lcom/google/firebase/platforminfo/۟۟۟ۥ۟;->ۤ۟ۦۡ(Ljava/lang/Object;)Landroid/os/Bundle;

    move-result-object v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-eqz v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_5
    invoke-static {}, Lk6/w5;->۟ۡۦ۟ۢ()[S

    move-result-object v0

    const/4 v2, 0x0

    sget v3, Lg7/۠ۤۧ;->۟ۤۧۦ:I

    xor-int/lit8 v3, v3, 0x33

    const/16 v4, 0x25b

    invoke-static {v0, v2, v3, v4}, Landroidx/compose/ui/layout/۟ۢ۠ۨ۠;->ۣۣۣۣ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0, v5}, Lr7/ۧ۠۠ۤ;->۟ۢۥۤۧ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v0

    invoke-static {v0}, La8/ۣۡۨ۠;->ۣۧ۠ۡ(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lk6/w5;->e:Ljava/lang/Boolean;

    :sswitch_6
    invoke-static {}, Lcom/google/firebase/remoteconfiginterop/ۢ۟ۢۦ;->۟ۧۦۥ()I

    move-result v1

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_7
    if-gtz v1, :cond_2

    const v0, 0xbe60

    goto :goto_2

    :cond_2
    :sswitch_8
    const v0, 0xbe41

    goto :goto_2

    :sswitch_9
    const-string v0, "bS"

    invoke-static {v0}, Lx7/۟ۤۡ۟ۦ;->۟ۤۦۥۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->decode(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_a
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_6
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_6
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_7
        0xb918 -> :sswitch_a
        0xb939 -> :sswitch_9
        0xb97b -> :sswitch_8
    .end sparse-switch
.end method

.method public static ۟ۡۦ۟ۢ()[S
    .locals 2

    invoke-static {}, Lcom/google/firebase/۟ۥۧۡۨ;->۟ۦۣ۟ۡ()I

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
    sget-object v0, Lk6/w5;->short:[S

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
