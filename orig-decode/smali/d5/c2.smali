.class public final Ld5/c2;
.super Ld9/j;

# interfaces
.implements Lc9/a;


# instance fields
.field public final a:Lm0/g1;

.field public final b:Lcom/auto/accept/ui/viewmodel/MainViewModel;

.field public final c:Ljava/lang/String;

.field public final d:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lm0/g1;Lcom/auto/accept/ui/viewmodel/MainViewModel;Ljava/lang/String;I)V
    .locals 2

    iput-object p1, p0, Ld5/c2;->a:Lm0/g1;

    iput-object p2, p0, Ld5/c2;->b:Lcom/auto/accept/ui/viewmodel/MainViewModel;

    iput-object p3, p0, Ld5/c2;->c:Ljava/lang/String;

    iput p4, p0, Ld5/c2;->d:I

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ld9/j;-><init>(I)V

    invoke-static {}, Lx2/۟ۢۥ;->ۢۤۥۨ()I

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
    const-string v0, "RsuPZjHbkzYqkDC0bfX3C3gloE"

    invoke-static {v0}, Lcom/google/firebase/database/collection/ۨۤ۟ۧ;->ۦۦۥۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->decode(Ljava/lang/String;)Ljava/lang/Long;

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


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    invoke-static {p0}, Lp0/۟ۧۧۧ۟;->۟ۥۢۦۣ(Ljava/lang/Object;)Lm0/g1;

    move-result-object v0

    invoke-static {v0}, Lt0/ۣ۟۠ۡۢ;->ۣ۟ۡۡۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

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
    if-eqz v0, :cond_0

    const/16 v1, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Lcom/google/android/gms/auth/api/signin/ۦ۟;->ۡۥ۟ۦ(Ljava/lang/Object;)Lcom/auto/accept/ui/viewmodel/MainViewModel;

    move-result-object v1

    invoke-static {p0}, Lcom/google/firebase/firestore/proto/۟ۥۡۤۧ;->ۧۥۣۨ(Ljava/lang/Object;)I

    move-result v2

    invoke-static {p0}, Lcom/google/android/gms/common/ۦۢۨ;->ۦۦ۟ۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v1, v2, v0, v3, v4}, Lu4/ۧۦۦۧ;->ۧۨۤۥ(Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;Z)V

    :sswitch_3
    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v0

    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch
.end method
