.class public final Lu1/h3;
.super Ljava/lang/Object;

# interfaces
.implements Lu1/g3;


# static fields
.field public static final b:Lm0/n1;


# instance fields
.field public final a:Lm0/n1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lo1/a0;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo1/a0;-><init>(I)V

    sget-object v1, Lm0/o3;->a:Lm0/o3;

    invoke-static {v0, v1}, Ld7/t;->g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;

    move-result-object v0

    sput-object v0, Lu1/h3;->b:Lm0/n1;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    sget-object v1, Lm0/o3;->a:Lm0/o3;

    invoke-static {v0, v1}, Ld7/t;->g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;

    move-result-object v0

    iput-object v0, p0, Lu1/h3;->a:Lm0/n1;

    return-void
.end method
