.class public final synthetic Lz/n;
.super Ld9/n;


# instance fields
.field public final synthetic o:I


# direct methods
.method public constructor <init>(Ljava/lang/Object;I)V
    .locals 13

    iput p2, p0, Lz/n;->o:I

    const/4 v0, 0x1

    if-eq p2, v0, :cond_1

    const/4 v0, 0x2

    if-eq p2, v0, :cond_0

    const-class v3, Lm0/l3;

    const-string v4, "value"

    const-string v5, "getValue()Ljava/lang/Object;"

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Ld9/p;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void

    :cond_0
    const-class v9, Lm9/e0;

    const-string v10, "classSimpleName"

    const-string v11, "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;"

    const/4 v12, 0x1

    move-object v7, p0

    move-object v8, p1

    invoke-direct/range {v7 .. v12}, Ld9/p;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void

    :cond_1
    const-class v2, Lm0/l3;

    const-string v3, "value"

    const-string v4, "getValue()Ljava/lang/Object;"

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Ld9/p;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method
