.class public final Lb1/d;
.super Ljava/lang/Object;

# interfaces
.implements Lm2/b;


# instance fields
.field public a:Lb1/a;

.field public b:Lb1/g;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lb1/i;->a:Lb1/i;

    iput-object v0, p0, Lb1/d;->a:Lb1/a;

    return-void
.end method


# virtual methods
.method public final a(Lc9/c;)Lb1/g;
    .locals 1

    new-instance v0, Lb1/g;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object p1, v0, Lb1/g;->a:Lc9/c;

    iput-object v0, p0, Lb1/d;->b:Lb1/g;

    return-object v0
.end method

.method public final c()F
    .locals 1

    iget-object v0, p0, Lb1/d;->a:Lb1/a;

    invoke-interface {v0}, Lb1/a;->c()Lm2/b;

    move-result-object v0

    invoke-interface {v0}, Lm2/b;->c()F

    move-result v0

    return v0
.end method

.method public final m()F
    .locals 1

    iget-object v0, p0, Lb1/d;->a:Lb1/a;

    invoke-interface {v0}, Lb1/a;->c()Lm2/b;

    move-result-object v0

    invoke-interface {v0}, Lm2/b;->m()F

    move-result v0

    return v0
.end method
