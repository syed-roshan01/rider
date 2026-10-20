.class public final Lh0/d;
.super Ld9/j;

# interfaces
.implements Lc9/e;


# instance fields
.field public final synthetic a:Lh0/m;

.field public final synthetic b:Z

.field public final synthetic c:Ll2/h;

.field public final synthetic d:Z

.field public final synthetic e:Ly0/o;

.field public final synthetic f:I


# direct methods
.method public constructor <init>(Lh0/m;ZLl2/h;ZLy0/o;I)V
    .locals 0

    iput-object p1, p0, Lh0/d;->a:Lh0/m;

    iput-boolean p2, p0, Lh0/d;->b:Z

    iput-object p3, p0, Lh0/d;->c:Ll2/h;

    iput-boolean p4, p0, Lh0/d;->d:Z

    iput-object p5, p0, Lh0/d;->e:Ly0/o;

    iput p6, p0, Lh0/d;->f:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    move-object v5, p1

    check-cast v5, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    iget-object v0, p0, Lh0/d;->a:Lh0/m;

    iget-boolean v1, p0, Lh0/d;->b:Z

    iget-object v2, p0, Lh0/d;->c:Ll2/h;

    iget-boolean v3, p0, Lh0/d;->d:Z

    iget-object v4, p0, Lh0/d;->e:Ly0/o;

    iget p1, p0, Lh0/d;->f:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lm0/s;->m(I)I

    move-result v6

    invoke-static/range {v0 .. v6}, Ld7/t;->h(Lh0/m;ZLl2/h;ZLy0/o;Lm0/m;I)V

    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1
.end method
