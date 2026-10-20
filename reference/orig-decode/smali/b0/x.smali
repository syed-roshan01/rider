.class public final Lb0/x;
.super Ljava/lang/Object;

# interfaces
.implements Lb0/q;
.implements Lr1/k0;


# instance fields
.field public final a:Ljava/util/List;

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:Lv/h1;

.field public final f:I

.field public final g:I

.field public final h:I

.field public final i:Lb0/g;

.field public final j:Lb0/g;

.field public k:F

.field public l:I

.field public m:Z

.field public final n:Z

.field public final synthetic o:Lr1/k0;


# direct methods
.method public constructor <init>(Ljava/util/List;IIILv/h1;IIILb0/g;Lb0/g;FIZLr1/k0;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb0/x;->a:Ljava/util/List;

    iput p2, p0, Lb0/x;->b:I

    iput p3, p0, Lb0/x;->c:I

    iput p4, p0, Lb0/x;->d:I

    iput-object p5, p0, Lb0/x;->e:Lv/h1;

    iput p6, p0, Lb0/x;->f:I

    iput p7, p0, Lb0/x;->g:I

    iput p8, p0, Lb0/x;->h:I

    iput-object p9, p0, Lb0/x;->i:Lb0/g;

    iput-object p10, p0, Lb0/x;->j:Lb0/g;

    iput p11, p0, Lb0/x;->k:F

    iput p12, p0, Lb0/x;->l:I

    iput-boolean p13, p0, Lb0/x;->m:Z

    iput-boolean p15, p0, Lb0/x;->n:Z

    iput-object p14, p0, Lb0/x;->o:Lr1/k0;

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget-object v0, p0, Lb0/x;->o:Lr1/k0;

    invoke-interface {v0}, Lr1/k0;->a()I

    move-result v0

    return v0
.end method

.method public final b()I
    .locals 1

    iget-object v0, p0, Lb0/x;->o:Lr1/k0;

    invoke-interface {v0}, Lr1/k0;->b()I

    move-result v0

    return v0
.end method

.method public final d()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lb0/x;->o:Lr1/k0;

    invoke-interface {v0}, Lr1/k0;->d()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final e()V
    .locals 1

    iget-object v0, p0, Lb0/x;->o:Lr1/k0;

    invoke-interface {v0}, Lr1/k0;->e()V

    return-void
.end method
