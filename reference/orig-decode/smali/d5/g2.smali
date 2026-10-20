.class public final Ld5/g2;
.super Ld9/j;

# interfaces
.implements Lc9/e;


# instance fields
.field public final a:Ld5/p1;

.field public final b:Z

.field public final c:Z

.field public final d:Lc9/a;

.field public final e:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ld5/p1;ZZLc9/a;I)V
    .locals 2

    iput-object p1, p0, Ld5/g2;->a:Ld5/p1;

    iput-boolean p2, p0, Ld5/g2;->b:Z

    iput-boolean p3, p0, Ld5/g2;->c:Z

    iput-object p4, p0, Ld5/g2;->d:Lc9/a;

    iput p5, p0, Ld5/g2;->e:I

    sget v0, Lf4/ۡۤۡ;->۟ۡۧۢۢ:I

    xor-int/lit16 v0, v0, 0x384

    invoke-direct {p0, v0}, Ld9/j;-><init>(I)V

    invoke-static {}, Lcom/google/firebase/measurement/ۧۤۦۧ;->ۧۨۡ۟()I

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
    const-string v0, "ZyWNfjIUr0lYdFwCV2E3G86HLgV7F"

    invoke-static {v0}, Lf0/ۣۤ۠۟;->ۣ۟ۡۧۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->decode(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

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


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v5, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v10, 0x0

    const/4 v7, 0x0

    const-string v8, "\u06e5\u06e6\u06df"

    :goto_0
    invoke-static {v8}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v8

    sparse-switch v8, :sswitch_data_0

    or-int v10, v11, v9

    const-string v8, "\u06e2\u06e1\u06e5"

    goto :goto_0

    :sswitch_0
    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v7

    const-string v8, "\u06e8\u06e6\u06df"

    goto :goto_0

    :sswitch_1
    move-object v4, p1

    check-cast v4, Lm0/m;

    const-string v8, "\u06e3\u06e3\u06e6"

    goto :goto_0

    :sswitch_2
    xor-int/lit8 v11, v5, 0x1

    const-string v8, "\u06df\u06e7\u06e0"

    goto :goto_0

    :sswitch_3
    invoke-static {p0}, Lf4/ۡۥۣۢ;->ۨۥۥۣ(Ljava/lang/Object;)Lc9/a;

    move-result-object v3

    const-string v8, "\u06e2\u06e0\u06e5"

    goto :goto_0

    :sswitch_4
    and-int/lit8 v9, v5, 0x1

    const-string v8, "\u06e0\u06e2\u06df"

    goto :goto_0

    :sswitch_5
    invoke-static {p0}, Lr7/ۧ۠۠ۤ;->ۤۥۥۡ(Ljava/lang/Object;)Z

    move-result v1

    const-string v8, "\u06e3\u06e5\u06e8"

    goto :goto_0

    :sswitch_6
    move-object v6, p2

    check-cast v6, Ljava/lang/Number;

    const-string v8, "\u06e3\u06df\u06e1"

    goto :goto_0

    :sswitch_7
    invoke-static {p0}, Lcom/google/firebase/remoteconfig/interop/۠ۧۤۧ;->ۣ۟ۨۦۨ(Ljava/lang/Object;)Z

    move-result v2

    const-string v8, "\u06e7\u06e4\u06e7"

    goto :goto_0

    :sswitch_8
    invoke-static {v10}, La7/۠ۢۧ;->ۣۣ۟ۡۨ(I)I

    move-result v5

    const-string v8, "\u06e1\u06e2\u06e5"

    goto :goto_0

    :sswitch_9
    invoke-static {p0}, Le2/۟ۤۢۦ;->۟ۡۤۧۥ(Ljava/lang/Object;)I

    move-result v5

    const-string v8, "\u06e4\u06e6\u06e4"

    goto :goto_0

    :sswitch_a
    invoke-static/range {v0 .. v5}, Lh8/۟ۨۧ;->۟ۥۤۡۦ(Ljava/lang/Object;ZZLjava/lang/Object;Ljava/lang/Object;I)V

    const-string v8, "\u06e1\u06e8\u06df"

    goto :goto_0

    :sswitch_b
    invoke-static {v6}, Lu4/۟ۡۢۦۣ;->ۣۥۧۤ(Ljava/lang/Object;)I

    move-result v5

    const-string v8, "\u06e1\u06e4\u06e8"

    goto :goto_0

    :sswitch_c
    invoke-static {p0}, Lcom/google/android/gms/internal/auth-api-phone/ۣۨۢۧ;->۠ۢۢۢ(Ljava/lang/Object;)Ld5/p1;

    move-result-object v0

    const-string v8, "\u06e3\u06e7\u06e7"

    goto :goto_0

    :sswitch_d
    return-object v7

    :sswitch_data_0
    .sparse-switch
        0x1aab1d -> :sswitch_2
        0x1aaee4 -> :sswitch_a
        0x1aaf25 -> :sswitch_c
        0x1aaf98 -> :sswitch_0
        0x1ab267 -> :sswitch_9
        0x1ab286 -> :sswitch_8
        0x1ab605 -> :sswitch_b
        0x1ab686 -> :sswitch_6
        0x1ab6c6 -> :sswitch_7
        0x1ab703 -> :sswitch_5
        0x1abaa2 -> :sswitch_4
        0x1abe5e -> :sswitch_1
        0x1ac5aa -> :sswitch_3
        0x1ac9a1 -> :sswitch_d
    .end sparse-switch
.end method
