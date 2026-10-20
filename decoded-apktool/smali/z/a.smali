.class public final Lz/a;
.super Ld9/j;

# interfaces
.implements Lc9/e;


# instance fields
.field public final synthetic a:Ly0/o;

.field public final synthetic b:Lz/g0;

.field public final synthetic c:Ly/t0;

.field public final synthetic d:Z

.field public final synthetic e:Ly/i;

.field public final synthetic f:Ly0/b;

.field public final synthetic n:Lv/y0;

.field public final synthetic o:Z

.field public final synthetic p:Lc9/c;

.field public final synthetic q:I

.field public final synthetic r:I


# direct methods
.method public constructor <init>(Ly0/o;Lz/g0;Ly/t0;ZLy/i;Ly0/b;Lv/y0;ZLc9/c;II)V
    .locals 0

    iput-object p1, p0, Lz/a;->a:Ly0/o;

    iput-object p2, p0, Lz/a;->b:Lz/g0;

    iput-object p3, p0, Lz/a;->c:Ly/t0;

    iput-boolean p4, p0, Lz/a;->d:Z

    iput-object p5, p0, Lz/a;->e:Ly/i;

    iput-object p6, p0, Lz/a;->f:Ly0/b;

    iput-object p7, p0, Lz/a;->n:Lv/y0;

    iput-boolean p8, p0, Lz/a;->o:Z

    iput-object p9, p0, Lz/a;->p:Lc9/c;

    iput p10, p0, Lz/a;->q:I

    iput p11, p0, Lz/a;->r:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    move-object v9, p1

    check-cast v9, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    iget-object v0, p0, Lz/a;->a:Ly0/o;

    iget-object v1, p0, Lz/a;->b:Lz/g0;

    iget-object v2, p0, Lz/a;->c:Ly/t0;

    iget-boolean v3, p0, Lz/a;->d:Z

    iget-object v4, p0, Lz/a;->e:Ly/i;

    iget-object v5, p0, Lz/a;->f:Ly0/b;

    iget-object v6, p0, Lz/a;->n:Lv/y0;

    iget-boolean v7, p0, Lz/a;->o:Z

    iget-object v8, p0, Lz/a;->p:Lc9/c;

    iget p1, p0, Lz/a;->q:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lm0/s;->m(I)I

    move-result v10

    iget v11, p0, Lz/a;->r:I

    invoke-static/range {v0 .. v11}, Ld9/i;->d(Ly0/o;Lz/g0;Ly/t0;ZLy/i;Ly0/b;Lv/y0;ZLc9/c;Lm0/m;II)V

    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1
.end method
